public class TestAssertion2{
	public static void main(String[] args){
		new TestAssertion2().process(-12);
	}
	
	public void process(int age){
		assert age>=0:"���䳬������Χ��";
		System.out.println("�������䣺" + age);
		//---	
	}	
}