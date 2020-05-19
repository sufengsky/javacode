public class TestAutoBoxing{
	public static void main(String args[]){
		Integer t1 = new Integer(3);  
		int i = t1;		
		int j = 4;
		Integer t2 = j; 
		System.out.println(i);
		System.out.println(t2.toString());
		
		m1(20);
		System.out.println(m2(50));
	}
	
	public static void m1(Integer it){
		int k = it + 5;    //等价于
		k = it.intValue() + 5;
		System.out.println(k);	
	}
	
	public static int m2(int i){
		return i * 2;	
	}
	
}