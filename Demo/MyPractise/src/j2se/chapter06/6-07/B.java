package p2;
import p1.A;
public class B extends A{	
	public void mb(){
		m = m + 1;	//�Ϸ����ȼ���  this.m = this.m + 1;
		n = n * 2;	//�Ϸ����ȼ���  this.n = this.n * 2;
	}
	
	public static void main(String[] args){
		B b = new B();
		b.m = 7;	//�Ϸ�
		b.n = 8;	//�Ϸ�
		A a = new A();
		a.m = 9;	//�Ϸ�
		a.n = 10;	//�Ƿ�    	
	}
}