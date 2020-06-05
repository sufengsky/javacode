package j2se.chapter09.d9_05;

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
	public boolean equals(Object o){
		if(o instanceof Person){
			Person p = (Person)o;
			if(this.age == p.age)
				return true;
			else
				return false;
		}
		return false;	
	}
} 
