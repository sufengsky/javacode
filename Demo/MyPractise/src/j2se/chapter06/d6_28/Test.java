class A{
	private int i = 5;
	{
		System.out.println("创建新对象---");	
	}
	public A(){}
	public A(int a){
		System.out.println("开始执行构造方法体中语句");
		i = a;
		System.out.println("构造方法体中语句执行完毕");
	}
}

public class Test {
	public static void main(String[] args) {
		new A();
		new A(3);
	}
}