import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

public class TestServer {
	public static void main(String args[]) {
		try {		
			ServerSocket s = new ServerSocket(8888);
			while (true) {
				Socket s1 = s.accept();
				OutputStream os = s1.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF("你好,客户端地址信息: " + s1.getInetAddress()
					+ "\t客户端通信端口号: " + s1.getPort());
				dos.writeUTF("再见！");
				dos.close();
				s1.close();
			}
		}catch (IOException e) {
			e.printStackTrace();		
		}
	}
}