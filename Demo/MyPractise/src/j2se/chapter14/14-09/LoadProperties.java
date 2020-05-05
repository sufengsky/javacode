import java.io.*;
import java.util.Properties;

public class LoadProperties{
	public static void main(String[] args){
		try{
			Properties ps = new Properties();
			FileReader fr = new FileReader("props.txt");
			ps.load(fr);
			fr.close();				
			ps.list(System.out);
		}catch(Exception e){
			e.printStackTrace();	
		}
	}
}