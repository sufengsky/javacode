public class Person{
	private String name;
	public Person(String name){
		this.name = name;
		System.out.println("创建Person对象，name:" + name);	
	}
	//---	
	public void finalize(){
		System.out.println("销毁Person对象，name:" + name);	
	}
}