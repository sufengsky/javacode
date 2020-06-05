package j2se.chapter14.d14_04;

import java.io.*;
public class Test{
	public static void main(String args[]){
		try{
			FileOutputStream fos;
			DataOutputStream dos;
			FileInputStream fis;
			DataInputStream dis;
			fos = new FileOutputStream("myfile.data");
			dos = new DataOutputStream(fos);
			dos.writeUTF("休.格兰特");
			dos.writeInt(40);
			dos.close();
			fis = new FileInputStream("myfile.data");
			dis = new DataInputStream(fis);
			System.out.println("name:" + dis.readUTF());
			System.out.println("age:" + dis.readInt());
			fis.close();
		}catch(IOException e){
			System.out.println(e);	
		}
	}
}