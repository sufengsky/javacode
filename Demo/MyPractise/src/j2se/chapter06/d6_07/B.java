package j2se.chapter06.d6_07;
import p1.A;
public class B extends A{	
	public void mb(){
		m = m + 1;	//合法，等价于  this.m = this.m + 1;
		n = n * 2;	//合法，等价于  this.n = this.n * 2;
	}
	
	public static void main(String[] args){
		B b = new B();
		b.m = 7;	//合法
		b.n = 8;	//合法
		A a = new A();
		a.m = 9;	//合法
		a.n = 10;	//非法    	
	}
}