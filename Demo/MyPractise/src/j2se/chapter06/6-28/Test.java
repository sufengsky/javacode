class A{
	private int i = 5;
	{
		System.out.println("�����¶���---");	
	}
	public A(){}
	public A(int a){
		System.out.println("��ʼִ�й��췽���������");
		i = a;
		System.out.println("���췽���������ִ�����");
	}
}

public class Test {
	public static void main(String[] args) {
		new A();
		new A(3);
	}
}