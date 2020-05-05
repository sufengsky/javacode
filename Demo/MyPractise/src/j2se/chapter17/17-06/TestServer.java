import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
public class TestServer {
	private ServerSocket ss;
	private Socket s;
	private DataInputStream dis;
	private DataOutputStream dos;
	private TextArea ta;
	private TextField tf;
		
	public static void main(String args[]) {
		TestServer ts = new TestServer();
		ts.createUI();
		ts.connect();	
		ts.createThread();
	}
	public void connect(){
		try {		
			ss = new ServerSocket(8888);
			s = ss.accept();
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
		}catch (IOException e) {
			e.printStackTrace();	
			//13701303436  
				
		}
	}
	
	public void createUI(){
		Frame f = new Frame("Server");
		ta = new TextArea();
		tf = new TextField();
		Button send = new Button("发送");
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		p.add(tf,"Center");
		p.add(send,"East");
		f.add(ta,"Center");
		f.add(p,"South");
		MyServerListener listener = new MyServerListener(this);
		send.addActionListener(listener);		
		tf.addActionListener(listener);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			}	
		});
		f.setSize(400,400);
		f.setVisible(true);	
	}

	public void createThread(){
		MyServerReader reader = new MyServerReader(this);
		reader.start(); 
	}
	
	public void close(){
		try{
			dis.close();
			dos.close();
			s.close();
			ss.close();	
		}catch (IOException e) {
			e.printStackTrace();		
		}
	}

	public DataInputStream getDataInputStream(){
		return dis;	
	}
	public DataOutputStream getDataOutputStream(){
		return dos;	
	}
	public TextArea getTextArea(){
		return ta;	
	}
	public TextField getTextField(){
		return tf;	
	}
}

class MyServerListener implements ActionListener{
	private TestServer server;	
	public MyServerListener(TestServer server){
		this.server = server;
	}
	public void actionPerformed(ActionEvent e){
		TextField tf = server.getTextField();
		String info = tf.getText();
		server.getTextArea().append("自己说: " + info + "\n");
		try{
			server.getDataOutputStream().writeUTF(info);	
		}catch (IOException e1) {
			e1.printStackTrace();		
		}
		if(info.equals("bye")){
			server.close();
			System.exit(0);	
		}
		tf.setText("");
		tf.requestFocus();
	}	
}

class MyServerReader extends Thread{
	private TestServer server;
	public MyServerReader(TestServer server){
		this.server = server;	
	}
	public void run(){
		String info;
		DataInputStream dis = server.getDataInputStream();
		TextArea ta = server.getTextArea();
		try{
			while(true){
				info = dis.readUTF();
				ta.append("对方说: " + info + "\n");
				if(info.equals("bye")){
					server.close();
					System.exit(0);
				}
			}		
		}catch (IOException e) {
			e.printStackTrace();		
		}	
	} 	
}