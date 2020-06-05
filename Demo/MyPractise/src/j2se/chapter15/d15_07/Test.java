package j2se.chapter15.d15_07;

import java.util.Vector;
public class Test{
	public static void main(String[] args){
		Test t = new Test();		
		String valid = t.evaluate("tiger","tiger");
		Integer i = t.evaluate(new Integer(300),new Integer(350));
		System.out.println(valid);
		System.out.println(i);
	}
	
	public <T> T evaluate(T a,T b){
		if(a.equals(b))
			return a;
		else
			return null;	
	}
}
