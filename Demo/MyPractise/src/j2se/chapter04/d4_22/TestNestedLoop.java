package j2se.chapter04.d4_22;

public class TestNestedLoop{
	public static void main(String args[]){
		TestNestedLoop tn = new TestNestedLoop();
		int total = tn.m(4);  	//1! + 2! + 3! + 4! = 33
		System.out.println(total);
	}
	public int m(int n){
		int result = 0;
		for(int i=1; i<=n; i++){
			int temp = 1;
			for(int j=1; j<=i; j++){
				temp *= j;	
			}
			result += temp;	
		}	
		return result;
	}
}
