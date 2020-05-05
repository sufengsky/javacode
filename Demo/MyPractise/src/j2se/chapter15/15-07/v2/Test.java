import java.util.Vector;
public class Test<T>{
	public static void main(String[] args){
		Test<String> ts = new Test<String>();		
		String valid = ts.evaluate("tiger","tiger");
		System.out.println(valid);
		
		Test<Integer> ti = new Test<Integer>();
		Integer i = ti.evaluate(new Integer(300),new Integer(300));
		System.out.println(i);
	}
	
	public  T evaluate(T a,T b){
		if(a.equals(b))
			return a;
		else
			return null;	
	}
}
