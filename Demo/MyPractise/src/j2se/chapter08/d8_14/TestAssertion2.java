package j2se.chapter08.d8_14;

public class TestAssertion2{
	public static void main(String[] args){
		new TestAssertion2().process(-12);
	}
	
	public void process(int age){
		assert age>=0:"年龄超出合理范围！";
		System.out.println("您的年龄：" + age);
		//---	
	}	
}