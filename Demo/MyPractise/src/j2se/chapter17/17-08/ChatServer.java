import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.net.*;
import java.util.*;


public class ChatServer{
    private Selector selector = null;
    private ServerSocketChannel ssc = null;
    //��������ͨ�Ŷ˿ں�
    private int port = 8888;
    //�����û��б�
	private Hashtable<String,SocketChannel> userList = null;   
    
    public ChatServer(){}    
	public ChatServer(int port){
		this.port = port;
    }
    
    //��ʼ��������
    public void init(){
    	try{
    		//����ѡ��������
			selector = Selector.open();
			//����ServerSocketChannel
			ssc = ServerSocketChannel.open();
			//����ServerSocketChannelΪ������ģʽ
			ssc.configureBlocking(false);
			InetAddress ia = InetAddress.getLocalHost();
			InetSocketAddress isa = new InetSocketAddress(ia,port);
			//���뱾ͨ����صķ������׽��ֶ���ﶨ��ָ����ַ�Ͷ˿�
			ssc.socket().bind(isa);
			//���������û��б�
			userList = new Hashtable<String,SocketChannel>();
		}catch(IOException e){
			e.printStackTrace();	
		}
    }
    
    //����������
	public void start(){
		try{
			//��ServerSocketChannelע�ᵽSelector�ϣ�׼����������������
			SelectionKey acceptKey = ssc.register(selector, SelectionKey.OP_ACCEPT );
			SocketChannel sc;
			int n;	
			String name;   	//�û���
			String msg;		//�û�������Ϣ
			while (true){	
				//ѡ��ǰ���д��ھ���״̬��ͨ������Ӧ��ѡ���,������Щ�������ѡ�����
				n = selector.select(); //nΪ��ѡ������м��ĸ���
		    	if(n > 0 ){
		    		//��ȡ��ѡ��������ѡ�������
					Set readyKeys = selector.selectedKeys(); 
					Iterator it = readyKeys.iterator();	
					//������ǰ��ѡ�����
					while (it.hasNext()) {
						SelectionKey key = (SelectionKey)it.next();
						//�ӵ�ǰ��ѡ��������Ƴ���ǰ���������ظ�����
						it.remove();
						//�����ǰ����Ӧ��ͨ����׼���ý����µ��׽�������
						if (key.isAcceptable()) {
							//��ȡ��ǰ����Ӧ�Ŀ�ѡ��ͨ����ServerSocketChannel��  
							ssc = (ServerSocketChannel) key.channel();
							//�����µ��׽����������󣬷����½���SocketChannel
							sc = (SocketChannel) ssc.accept();
							//��������û�����
							if(sc != null){
								//�����������û�����
								name = readMessage(sc);
								//�����½���SocketChannelΪ������ģʽ
								sc.configureBlocking(false);
								//���½���SocketChannelע�ᵽSelector�ϣ�׼����������"д"������
								//������ǰ�û����Ը����ķ�ʽ������¼���½���ѡ����ϡ�
								SelectionKey newKey = sc.register(selector,SelectionKey.OP_WRITE,name);	
								//���������û���Ϣ���뵽�����û��б�
								userList.put(name,sc);
								//����"���û�����"֪ͨ
								transmitMessage(name + " in!","--Server Info--");
							}
						}
						//���������ǰ����Ӧ��ͨ����׼���ý���"д"����
						else if (key.isWritable()) {
							//��ȡ��ǰ����Ӧ�Ŀ�ѡ��ͨ����SocketChannel�� 
							sc = (SocketChannel)key.channel();
							//���ո�ͨ����Ӧ�û��ķ�����Ϣ
							msg = readMessage(sc);
							//��ȡѡ����ϸ�����¼�ĵ�ǰ�û���
							name = key.attachment().toString();
							//����û����Ҫ����
							if(msg.equals("bye")){
								//�������û��б����Ƴ���ǰ�û�
								userList.remove(name);
								//ע����ǰѡ�����Ӧ��ע���ϵ
								key.cancel();
								//�رյ�ǰ��ѡ��ͨ�� 
								sc.close();
								//����"�û�����"֪ͨ
								transmitMessage(name + " out!","--Server Info--");
							}
							//����������յ����û�������Ϣ�ǿգ�""��
							else if(msg.length() > 0){
								//ת���û�������Ϣ
								transmitMessage(msg,name);
							}
						}
					}
				}
				//��ʱѭ�������ͷ������˴�����
				Thread.sleep(500);
			}
		}catch(Exception e){
			e.printStackTrace();	
		}
    }

	//ת���û�������Ϣ
	public void transmitMessage(String msg,String name){
		try{
			ByteBuffer buffer = ByteBuffer.wrap((name + ":" + msg).getBytes("GBK"));
			Collection channels = userList.values();
			SocketChannel sc;
			for(Object o:channels){
				sc = (SocketChannel)o;
				sc.write(buffer);
				buffer.flip();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
    }
  
  	//�����û�������Ϣ
    public String readMessage(SocketChannel sc){
		String result = null;
		int n = 0;
        ByteBuffer buf = ByteBuffer.allocate(1024);
		try{
            n = sc.read(buf);
			buf.flip();
			Charset charset = Charset.forName("GBK");
			CharsetDecoder decoder = charset.newDecoder();
			CharBuffer charBuffer = decoder.decode(buf);
			result = charBuffer.toString();
        }catch(IOException e){
			e.printStackTrace();
		}
		return result;
    }

    public static void main(String args[]){
		ChatServer server = new ChatServer();
		server.init();
		server.start();
	}
}