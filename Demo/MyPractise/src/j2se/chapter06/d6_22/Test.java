package j2se.chapter06.d6_22;

public class Test{
	public void m1(int i,double d){
		System.out.println("int - double!");	
	}	
	public void m1(double d,int i){
		System.out.println("double - int");	
	}
	public static void main(String args[]){
		Test t = new Test();
		t.m1(3,4.0);
		t.m1(4.0,3);
//		t.m1(3,4);  //编译出错
	}		
}