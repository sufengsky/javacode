package j2se.chapter08.d8_06;

public class Test{
	public static void main(String[] args)    {
		String friends[]={"Lisa","Billy","Kessy"};
		try {
			for(int i=0;i<5;i++) {
				System.out.println(friends[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e)  {
			System.out.println("index err");
		}
		System.out.println("\nthis is the end");
	}
}
