package j2se.chapter06.d6_09;

class Person{
	int age = 5;
	public int getAge(){
		return age;	
	}	
	public int getInfo(){
		return age;	
	}
}

class Student extends Person{
	int age = 6;
	public int getAge(){
		return age;	
	}	
}

public class Test{
	public static void main(String args[]){
		Person p = new Person();
		System.out.println(p.getAge());	
		
		Student s = new Student();
		System.out.println(s.age);	
		System.out.println(s.getAge());	
		System.out.println(s.getInfo());
	}	
}

