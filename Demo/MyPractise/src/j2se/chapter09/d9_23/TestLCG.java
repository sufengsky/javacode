public class TestLCG{
	public static void main(String args[]){
		test(32,5,8,7);		
	}	
	public static void test(int M,int a,int b,int seed){
		int r = seed;
		for(int i=0;i<30;i++){
			System.out.print(r + ",");
			r = (a * r + b) % M;	
		}	
	}
}