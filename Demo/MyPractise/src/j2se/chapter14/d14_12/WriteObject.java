import java.io.*;

public class WriteObject {
	public static void main(String[] args){
		try{
			FileOutputStream fos = new FileOutputStream("data.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new Employee("����",28,"�г���"));
			oos.writeObject(new Employee("����",34,"������"));
			oos.close();
		}catch(IOException e){
			e.printStackTrace();	
		}		
	}
}

