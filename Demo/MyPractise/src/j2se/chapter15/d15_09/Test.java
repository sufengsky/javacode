package j2se.chapter15.d15_09;

import java.util.Vector;
public class Test{
	public static void main(String[] args){
		Test t = new Test();
		Vector<Integer> vi = new Vector<Integer>();	
		vi.add(300);	
		vi.add(500);
		t.show(vi);
		
		Vector<Double> vd = new Vector<Double>();
		vd.add(3.14);
		vd.add(5.78);
 		t.show(vd);
 		
 		Vector<String> vs = new Vector<String>();
 		vs.add("Tom");
 		vs.add("Billy");
 		//t.show(vs);
 		
 		Vector<? extends Number> va ;
 		va = vi;
 		va = vd; 
 		//va = vs;
	}
	
	public void show(Vector<? extends Number> v){
			System.out.println(v);
	}
}
