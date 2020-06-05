package j2se.chapter14.d14_16;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class ReadKeyBoard {
	public static void main(String[] args){
		String local = System.getProperty("file.encoding");
		System.out.println("Local charset: " + local);
		try{
			byte[] bytes = new byte[1024];
			ByteBuffer bb = ByteBuffer.wrap(bytes);
			CharBuffer cb;
			Charset charset = Charset.forName("GB18030");
			CharsetDecoder decoder = charset.newDecoder();
			String txt;
			
			int n = System.in.read(bytes);
			while(n != -1){
				bb.position(n);
				bb.flip();
				cb = decoder.decode(bb);
				txt = cb.toString();
				System.out.print(txt);
				if(txt.startsWith("exit"))
					break;
				bb.clear();
				n = System.in.read(bytes);	
			}
		}catch(IOException e){
			e.printStackTrace();	
		}
	}
}