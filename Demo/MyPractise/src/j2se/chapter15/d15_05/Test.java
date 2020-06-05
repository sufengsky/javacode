package j2se.chapter15.d15_05;

import java.util.Vector;
public class Test{
	public static void main(String[] args){
		Vector<String> vs = new Vector<String>();
		vs.add("Tom");		
		vs.add("Billy");		
		vs.add("Kessey");		
		Test t = new Test();
		t.overview(vs);		
	}
	
	public void overview(Vector<String> v){
		for(String o:v){
			System.out.println(o);	
		}	
	}
}
