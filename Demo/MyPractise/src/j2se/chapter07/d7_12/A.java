package j2se.chapter07.d7_12;

public class A{
	public static int total = 0;
	public static class B{
		public void mb(){
			total = 100;
			System.out.println(total);	
		}	
	}	
}