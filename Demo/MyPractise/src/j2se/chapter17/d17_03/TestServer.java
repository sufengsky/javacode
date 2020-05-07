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
				dos.writeUTF("���,�ͻ��˵�ַ��Ϣ: " + s1.getInetAddress()
					+ "\t�ͻ���ͨ�Ŷ˿ں�: " + s1.getPort());
				dos.writeUTF("�ټ���");
				dos.close();
				s1.close();
			}
		}catch (IOException e) {
			e.printStackTrace();		
		}
	}
}