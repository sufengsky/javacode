package j2se.chapter06.d6_16.v2;

public class Person{
	private String name;
	private int age;
	public void setName(String name){
		this.name = name;	
	}	
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;	
	}
	public int getAge(){
		return age;	
	}	
	public String getInfo(){
		return "Name: " + name + "\tAge: " + age; 	
	}
}