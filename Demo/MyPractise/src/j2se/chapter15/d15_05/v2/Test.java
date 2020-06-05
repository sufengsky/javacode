package j2se.chapter15.d15_05.v2;

import java.util.*;
public class Test{
	public static void main(String[] args){
		Vector<String> vs = new Vector<String>();
		vs.add("Tom");		
		vs.add("Billy");		
		vs.add("Kessey");		
		Test t = new Test();
		t.overview(vs);		
	}
	
	public void overview(Vector v){
		v.add(new Integer(300));
		v.add(new Date());
		for(Object o:v){
			System.out.println(o);	
		}	
	}
}
