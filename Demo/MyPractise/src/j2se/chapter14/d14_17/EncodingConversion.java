package j2se.chapter14.d14_17;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class EncodingConversion {
	String file = "a.txt";
	public static void main(String[] args){
		EncodingConversion ec = new EncodingConversion();
		ec.createSampleFile();
		ec.readFile(); 
	}
	public void readFile(){
		String local = System.getProperty("file.encoding");
		try{
			FileInputStream fis = new FileInputStream(file);
			FileChannel fci = fis.getChannel();
			ByteBuffer bb = ByteBuffer.allocate(1024);
			fci.read(bb);
			bb.flip();
			Charset charset = Charset.forName("UTF-8");
			CharsetDecoder decoder = charset.newDecoder();
			CharBuffer cb = decoder.decode(bb);
			System.out.println(cb.toString());	
			fci.close();
			fis.close();
		}catch(IOException e){
			e.printStackTrace();	
		}
	}
	public void createSampleFile(){
		try{
			Charset charset = Charset.forName("UTF-8");
			CharsetEncoder encoder = charset.newEncoder();
			FileOutputStream fos = new FileOutputStream(file);
			FileChannel fco = fos.getChannel();
			
			char[] chars = "hello,你好\nhaha!".toCharArray();
			CharBuffer cb = CharBuffer.wrap(chars);
			ByteBuffer bb = encoder.encode(cb);
			fco.write(bb);
			fco.close();
			fos.close();
		}catch(IOException e){
			e.printStackTrace();	
		}
	}
	/*
	public void readFile(){
		String local = System.getProperty("file.encoding");
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = br.readLine();
			while(s != null){
				//System.out.println(s);	
				System.out.println(convert(s,local,"UTF-8"));	
				s = br.readLine();
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();	
		}
	}
	*/
	/*	
	public void readFile(){
		String local = System.getProperty("file.encoding");
		try{
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			while(s != null){
				System.out.println(s);	
				s = br.readLine();
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();	
		}
	}
	*/
	/*
	public String convert(String content,String source_charset,String dest_charset){
		String result = "";
		try{
			byte[] bytes = content.getBytes(source_charset);
			ByteBuffer bb = ByteBuffer.wrap(bytes);
			Charset charset = Charset.forName(dest_charset);
			CharsetDecoder decoder = charset.newDecoder();
			CharBuffer cb = decoder.decode(bb);
			result = cb.toString();	
		}catch(IOException e){
			e.printStackTrace();	
		}
		return result;	
	}
	*/	
	
	public String convert(String content,String source_charset,String dest_charset){
		String result = "";
		try{
			result = new String(content.getBytes(source_charset),dest_charset);
		}catch(IOException e){
			e.printStackTrace();	
		}
		return result;	
	}
}