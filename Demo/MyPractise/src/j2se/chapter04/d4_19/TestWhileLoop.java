package j2se.chapter04.d4_19;

public class TestWhileLoop{
	public static void main(String args[]){
		int i = 1;
		int result = 0;
		while(i <= 100){
			result += i;
			i ++;
		}
		System.out.println(result);	
	}
}
