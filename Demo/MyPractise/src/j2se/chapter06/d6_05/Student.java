package j2se.chapter06.d6_05;

public class Student{
	private String name;
	private int age;
	private String school;	
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
	public void setSchool(String school){
		this.school = school;	
	}
	public String getSchool(){
		return school;	
	}	
	public String getInfo(){
		return "Name: " + name + "\tAge: " + age; 	
	}	
}