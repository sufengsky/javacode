package j2se.chapter06.d6_30.v2;

public class TestSingle{
	public static void m1(){
		Single  s2 = Single.getSingle();
		System.out.println(s2.getName());
	}
	public static void main(String args[]) {			         
		Single  s1 = Single.getSingle();
		s1.setName("Tom");
		m1();			
	}
}