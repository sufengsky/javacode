package j2se.chapter08.d8_13;

public class TestAssertion{
	public static void main(String[] args){
		new TestAssertion().process(-12);
	}
	
	public void process(int age){
		assert age>=0;
		System.out.println("您的年龄：" + age);
		//---	
	}	
}