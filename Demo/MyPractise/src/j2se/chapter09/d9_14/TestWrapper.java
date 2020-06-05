package j2se.chapter09.d9_14;

public class TestWrapper{
	public static void main(String args[]){
		Integer t1 = new Integer(314);     	
		Integer t2 = new Integer("314");
		int i = t1.intValue();
		System.out.println(i);

		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));		
		System.out.println(t1.toString());
		
		System.out.println(Integer.toBinaryString(27));
		System.out.println(Integer.toOctalString(27));
		System.out.println(Integer.toHexString(27));
		
		i = Integer.parseInt("500");
		System.out.println(i);		     	
	}
}