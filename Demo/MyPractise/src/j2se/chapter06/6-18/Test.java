class A{
	public void m1(int i){
		System.out.println("Method m1 in class A, the value is " + i);	
	}	
	public void m2(int j){
		System.out.println("Method m2 in class A: " + j);	
	}
}

class B extends A{
	public void m1(double d){
		System.out.println("���ط��� m1,����ֵΪ��" + d);	
	}
	public void m2(int k){
		System.out.println("��д����m2������ֵΪ��" + k);	
	}
	/*
	public int m1(int m){		//�Ƿ����ȷ����ء������д
		System.out.print("haha!");	
	}
	*/
}

public class Test{
	public static void main(String args[]){
		B b = new B();
		b.m1(3);
		b.m1(3.14);
		b.m2(5);	
	}	
}