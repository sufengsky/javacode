package j2se.chapter09.d9_04;

public class TestEquals2{
	public static void main(String[] args){
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		s2 = s1;
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}	
}