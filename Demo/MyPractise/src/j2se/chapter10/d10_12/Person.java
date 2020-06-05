package j2se.chapter10.d10_12;

//import java.lang.Override;
public class Person{
	private String name;
	public Person(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;	
	}	
	public String getName(){
		return name;
	}
	@Override
	public String tostring(){
		return "Name: " + name; 	
	}	
}