package j2se.chapter08.d8_09;

import java.io.*;
public class TestIOException{
	public static void main(String[] args) {
		try{
			FileInputStream in=new FileInputStream("myfile.txt");
			int b;
			b = in.read();
			while(b!= -1) {
				System.out.print((char)b);
				b = in.read();
			}
			in.close();
		}catch(FileNotFoundException e){
			System.out.println("File is missing!");
		}catch(IOException e){
			e.printStackTrace();	
		}
		System.out.println("It's ok!");
	}
}
