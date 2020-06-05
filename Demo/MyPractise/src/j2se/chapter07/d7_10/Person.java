package j2se.chapter07.d7_10;

public abstract class Person{
	private String name;
	private int age;
	public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age = age;	
	}
	public String getInfo(){
		return "Name:" + name + "\tAge:" + age;	
	}	
	public abstract void work();
}