import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
import java.net.SocketException;

public class TestServer {
	public static void main(String args[]) {
		try {		
			ServerSocket s = new ServerSocket(8888);
			Socket s1 = s.accept();
			OutputStream os = s1.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			String info;
			while(true){
				info = dis.readUTF();
				System.out.println("对方说: " + info);
				if(info.equals("bye"))
					break;
				info = br.readLine();
				dos.writeUTF(info);
				if(info.equals("bye"))
					break;
			}
			dis.close();			
			dos.close();
			s1.close();
			s.close();
		}catch (SocketException e) {
				System.out.println("网络连接异常，程序退出!");
		}catch (IOException e) {
			e.printStackTrace();		
		}
	}
}