public class Person{
	private String name;
	public Person(String name){
		this.name = name;
		System.out.println("����Person����name:" + name);	
	}
	//---	
	public void finalize(){
		System.out.println("����Person����name:" + name);	
	}
}