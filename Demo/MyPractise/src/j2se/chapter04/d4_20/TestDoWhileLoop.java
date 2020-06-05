package j2se.chapter04.d4_20;

public class TestDoWhileLoop{
	public static void main(String args[]){
		int i = 1;
		int result = 0;
		do{
			result += i;
			i ++;
		}while(i <= 100);
		System.out.println(result);	
	}
}
