public class TestAnonymous2{
	public static void main(String args[]){
		TestAnonymous2 ta = new TestAnonymous2();
		ta.test(new Swimmer(){
			public void swim(){
				System.out.println("I'swimming!");	
			}	
		});

	}	
	/*	
	public static void main(String args[]){
		TestAnonymous2 ta = new TestAnonymous2();
		class Person implements Swimmer{
			public void swim(){
				System.out.println("I'swimming!");	
			}			
		}		
		ta.test(new Person());
	}	
	*/	
	public void test(Swimmer swimmer){
		swimmer.swim();	
	}
}