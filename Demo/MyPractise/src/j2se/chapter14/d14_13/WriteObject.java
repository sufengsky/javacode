import java.io.*;

public class WriteObject {
	public static void main(String[] args){
		try{
			Person.setResource(2345);
			FileOutputStream fos = new FileOutputStream("data.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Person p1 = new Person("Scott","tiger");
			Person p2 = new Person("Spring","field");
			System.out.println(Person.getResource());
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.close();
		}catch(IOException e){
			e.printStackTrace();	
		}		
	}
}