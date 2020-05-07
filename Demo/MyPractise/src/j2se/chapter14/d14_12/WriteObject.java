import java.io.*;

public class WriteObject {
	public static void main(String[] args){
		try{
			FileOutputStream fos = new FileOutputStream("data.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new Employee("张三",28,"市场部"));
			oos.writeObject(new Employee("李四",34,"技术部"));
			oos.close();
		}catch(IOException e){
			e.printStackTrace();	
		}		
	}
}

