package j2se.chapter14.d14_05;

import java.io.*;
public class MyReader{
	public void getInfo(Reader reader){
		try{
			int b = reader.read();
			while(b != -1){
				System.out.print((char)b);
				b = reader.read();	
			}
			System.out.println();
		}catch(IOException e){
			e.printStackTrace();	
		}		
	}	
}