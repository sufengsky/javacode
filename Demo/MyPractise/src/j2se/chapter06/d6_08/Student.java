package j2se.chapter06.d6_08;

public class Student extends Person {
	String school;	
	public String getInfo() {
	      return "Name:"+ name + "\tAge:"+ age + "\tSchool:" + school;
	}
}