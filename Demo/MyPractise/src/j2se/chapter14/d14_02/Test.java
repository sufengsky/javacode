package j2se.chapter14.d14_02;

import java.io.*;
public class Test {
	public static void main(String[] args) {
		try {
			FileReader input = new FileReader("a.txt");
			FileWriter output = new FileWriter("temp.txt");
			int read = input.read();		
			while ( read != -1 ) {
				output.write(read);	
				read = input.read();
			}			
			input.close();
			output.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
