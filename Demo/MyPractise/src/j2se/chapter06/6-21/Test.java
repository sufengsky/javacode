public class Test{
	public void m1(int i){
		System.out.println("int data: " + i);	
	}	
	public void m1(double d){
		System.out.println("double data: " + d);	
	}
	public static void main(String args[]){
		Test t = new Test();
		t.m1(3);
		t.m1(3.14);
		
		byte b = 12;
		t.m1(b);	
	}		
}