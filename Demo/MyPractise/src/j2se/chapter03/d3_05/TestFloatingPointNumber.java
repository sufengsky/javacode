package j2se.chapter03.d3_05;

public class TestFloatingPointNumber{
	public static void main(String[] args){
		double d1 = 15000.34;
		double d2 = 1.24e2;
		double d3 = 0x1.2P3;
		double d4 = 0x1.0p-3;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		double c1 = 3.0/0;
		System.out.println(c1);
		System.out.println(-3/0.0);
		System.out.println(0.0/0);
	}	
}