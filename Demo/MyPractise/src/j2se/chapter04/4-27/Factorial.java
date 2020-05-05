public class Factorial{
	public int f(int n){
		if(n == 1){
			return 1;
		}else{
			int k = f(n-1);
			return n*k;	
		}		
	}
	
	public static void main(String args[]){
		Factorial fact = new Factorial();
		int result = fact.f(4);
		System.out.println(result);
	}	
}
