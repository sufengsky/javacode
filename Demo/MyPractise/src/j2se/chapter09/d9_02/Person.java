package j2se.chapter09.d9_02;

public class Person{
	private int age;
	public Person(int age){
		this.age = age;	
	}
	public void setAge(int age){
		this.age = age;	
	}	
	public int getAge(){
		return age;
	}
	public String toString(){
		return "This is an instance of Person,age = " + age;
	}
} 
