package j2se.chapter14.d14_15;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class CopyFile {
	public static void main(String[] args){
		String source = "CopyFile.java";
		String dest = "b.txt";
		try{
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(dest);
			
			FileChannel fci = fis.getChannel();
			FileChannel fco = fos.getChannel();
			ByteBuffer bb = ByteBuffer.allocate(1024);
			
			int n = fci.read(bb);
			while(n != -1){
				bb.flip();
				fco.write(bb);
				bb.clear();
				n = fci.read(bb);	
			}
			
			fci.close();
			fco.close();
			fis.close();
			fos.close();			
		}catch(IOException e){
			e.printStackTrace();	
		}
	}
}