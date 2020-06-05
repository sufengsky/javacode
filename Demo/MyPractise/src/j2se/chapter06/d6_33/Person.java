package j2se.chapter06.d6_33;

public class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;	
	}
	public void setAge(int age){
			this.age = age;	
	}
	public int getAge(){
		return age;	
	}
	public void display(){
		System.out.println("Name:" + name + "\tAge:" + age);	
	}
}
