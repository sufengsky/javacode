import java.io.*;
import java.net.*;

public class TestClient {
	public static void main(String args[]) {
		try {		
			Socket s1 = new Socket("127.0.0.1",8888);
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			OutputStream os = s1.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);

			new MyClientReader(dis).start();			
			new MyClientWriter(dos).start();
		}catch (IOException e) {
			e.printStackTrace();		
		}
	}
}

class MyClientReader extends Thread{
	private DataInputStream dis;
	public MyClientReader(DataInputStream dis ){
		this.dis = dis;	
	}
	public void run(){
		String info;
		try{
			while(true){
				info = dis.readUTF();
				System.out.println("�Է�˵: " + info);
				if(info.equals("bye")){
					System.out.println("�Է����ߣ������˳�!");
					System.exit(0);
				}
			}		
		}catch (IOException e) {
			e.printStackTrace();		
		}	
	} 	
}

class MyClientWriter extends Thread{
	private DataOutputStream dos;
	public MyClientWriter(DataOutputStream dos){
		this.dos = dos;	
	}
	public void run(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String info;
		try{
			while(true){
				info = br.readLine();
				dos.writeUTF(info);
				if(info.equals("bye")){
					System.out.println("�Լ����ߣ������˳�!");
					System.exit(0);
				}
			}		
		}catch (IOException e) {
			e.printStackTrace();		
		}	
	} 	
}
