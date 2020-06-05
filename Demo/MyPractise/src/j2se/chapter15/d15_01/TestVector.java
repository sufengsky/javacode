package j2se.chapter15.d15_01;

import java.util.Vector;
import java.util.Date;

public class TestVector{
	public static void main(String args[]){
		Vector<String> v = new Vector<String>();
		v.addElement("Tom");	
		v.addElement("Billy");	
		v.addElement("Nancy");	
		v.addElement(new Date());		
		v.addElement(new Integer(300));	

		for(int i=0;i<v.size();i++){
			String name = v.elementAt(i);
			System.out.println(name);	
		}
	}	
}