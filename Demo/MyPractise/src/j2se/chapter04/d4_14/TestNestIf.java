public class TestNestIf{
	public static void main(String args[]){
		TestNestIf tni = new TestNestIf();
		int result = tni.max(3,4,5);
		System.out.println(result);
	}
	
	public int max(int a,int b,int c){
		int max;
		if(a > b)
			if(a > c)
				max = a;
			else
				max = c;
		else
			if(b > c)
				max = b;
			else
				max = c;
		return max;	
	}		
}