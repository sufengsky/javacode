package j2se.chapter14.d14_20;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class MappedFile {
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("a.txt");
			FileChannel channel = fis.getChannel();
			int length = (int)channel.size();
			MappedByteBuffer byteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, length);
			Charset charset = Charset.forName("GB18030");
			CharsetDecoder decoder = charset.newDecoder();
			CharBuffer charBuffer = decoder.decode(byteBuffer);
			System.out.print(charBuffer.toString());
		}catch(IOException e){
			e.printStackTrace();	
		}	
	}
}