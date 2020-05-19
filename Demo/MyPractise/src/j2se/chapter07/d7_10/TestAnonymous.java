public class TestAnonymous{
	public static void main(String args[]){
		Person sp = new Person(){
			public void work(){
				System.out.println("个人信息：" + this.getInfo());
				System.out.println("I am sailing, I am sailing!");	
			}
		};
		/*
		class Singer extends Person{
			public Singer(){}
			public Singer(String name,int age){
				super(name,age);
			}
			public void work(){
				System.out.println("个人信息：" + this.getInfo());
				System.out.println("I am sailing, I am sailing!");	
			}			
		}		
		Person sp = new Singer();
		*/
		sp.work();
	}	
}