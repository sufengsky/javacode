package j2se.chapter14.d14_09;

import java.io.*;
import java.util.Properties;

public class SaveProperties{
	public static void main(String[] args){
		try{
			Properties ps = new Properties();
			ps.setProperty("name","Scott");
			ps.setProperty("password","Tiger");
			FileWriter fw = new FileWriter("props.txt");
			ps.store(fw,"loginfo");	
			fw.close();		
		}catch(Exception e){
			e.printStackTrace();	
		}
	}
}