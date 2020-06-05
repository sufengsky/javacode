package j2se.chapter14.d14_13;

import java.io.*;

public class ReadObject{
	public static void main(String[] args){
		try{
			//Person.setResource(5555);
			FileInputStream fis = new FileInputStream("data.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person e1 = (Person)ois.readObject();
			Person e2 = (Person)ois.readObject();
			System.out.println(e1);		
			System.out.println(e2);		
			System.out.println(Person.getResource());			
			ois.close();
		}catch(IOException e){
			e.printStackTrace();	
		}catch(ClassNotFoundException e){
			e.printStackTrace();	
		}		
	}
}
