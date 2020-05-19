import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.awt.*;
import java.awt.event.*;

public class ChatClient {
	private SocketChannel sc = null;
	private String name = null;
	private Frame f;
	private TextArea ta;
	private TextField tf;
	private boolean runnable = true;

	public static void main(String[] args){
		ChatClient cc = new ChatClient();
		cc.createUI();
		cc.inputName();
		cc.connect();
		new ReceiveThread(cc,cc.getTextArea()).start();
	}
	public SocketChannel getSc(){
		return sc;	
	}
	public void setName(String name){
		this.name = name;
	}
	public TextArea getTextArea(){
		return ta;	
	}
	public TextField getTextField(){
		return tf;	
	}
	public boolean getRunnable(){
		return runnable;
	}	
	public void stop(){
		runnable = false;	
	}
	
	public void shutDown(){
		try{
			sc.write(ByteBuffer.wrap("bye".getBytes("GBK")));	
			ta.append("Exit in 5 seconds!");
			this.stop();
			Thread.sleep(5000);
			sc.close();
		}catch(Exception e){
			e.printStackTrace();	
		}
		System.exit(0);
	}
	
	public void createUI(){
		f = new Frame("Client");
		ta = new TextArea();
		ta.setEditable(false);
		tf = new TextField();
		Button send = new Button("Send");
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		p.add(tf,"Center");
		p.add(send,"East");
		f.add(ta,"Center");
		f.add(p,"South");
		MyClientListener listener = new MyClientListener(this);
		send.addActionListener(listener);
		tf.addActionListener(listener);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				ChatClient.this.shutDown();
			}	
		});
		f.setSize(400,400);
		f.setLocation(600,0);
		f.setVisible(true);	
		tf.requestFocus();
	}
	
	public boolean connect(){
		try{
			sc = SocketChannel.open();
			//"zlg"为目标计算机名
			InetSocketAddress isa = new InetSocketAddress("zlg",8888);
			sc.connect(isa);
			sc.configureBlocking(false);
			sc.write(ByteBuffer.wrap(name.getBytes("GBK")));
		}catch(Exception e){
			e.printStackTrace();	
		}
		return true;
	}
	
	public void inputName(){
		String name = javax.swing.JOptionPane.showInputDialog("Input Your Name:");
		this.setName(name);	
		f.setTitle(name);
	}
}

class MyClientListener implements ActionListener{
	private ChatClient client;	
	public MyClientListener(ChatClient client){
		this.client = client;
	}
	public void actionPerformed(ActionEvent e){
		TextField tf = client.getTextField();
		String info = tf.getText();
		if(info.equals("bye")){
			client.shutDown();	
		}else{
			try{
				client.getSc().write(ByteBuffer.wrap(info.getBytes("GBK")));
			}catch (Exception e1) {
				e1.printStackTrace();		
			}		
		}
		tf.setText("");
		tf.requestFocus();		
	}	
}

class ReceiveThread extends Thread{
	private ChatClient client;
	private TextArea ta;
		
	public ReceiveThread(ChatClient client,TextArea ta){
		this.client = client;	
		this.ta = ta;
	}
	public void run(){
		SocketChannel sc = client.getSc();
		ByteBuffer byteBuffer = ByteBuffer.allocate(2048);
		CharBuffer charBuffer = null;
		Charset charset = Charset.forName("GBK");
		CharsetDecoder decoder = charset.newDecoder();
		String msg = null;
		int n = 0;
		try{
			while(client.getRunnable()){
				n = sc.read(byteBuffer);
				if(n>0){
					byteBuffer.flip();
					charBuffer = decoder.decode(byteBuffer);
					msg = charBuffer.toString();
					ta.append(msg + "\n");
				}
				byteBuffer.clear();
				Thread.sleep(500);
			}
		}catch(Exception e){
			e.printStackTrace();
			System.exit(0);	
		}
	}
}