package j2se.chapter06.d6_23;

public class Person{
	private String name;
	private int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;	
	}	
	
	public Person(String name){
		this(name,18);	
		
	}
	public Person(int age){
		this("Anonymous",age);
	}
	public void showInfo(){
		System.out.println("Name:" + name + "\tage:" + age);	
	}
}
