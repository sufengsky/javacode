package j2se.chapter14.d14_12;

import java.io.*;

public class ReadObject{
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("data.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee e1 = (Employee)ois.readObject();
			Employee e2 = (Employee)ois.readObject();
					
			e1.showInfo();
			e2.showInfo();
			ois.close();
		}catch(IOException e){
			e.printStackTrace();	
		}catch(ClassNotFoundException e){
			e.printStackTrace();	
		}		
	}
}
