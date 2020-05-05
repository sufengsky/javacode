class Animal{
	protected int i = 1;	
}

class Person extends Animal{
	protected int i = 2;  //用于测试同名属性，无现实含义
	private String name = "Tom";
	private int age = 9;
	public String getInfo(){
		return "Name:" + name + "\tAge:" + age;	
	}	
	public void testI(){
		System.out.println(super.i);
		System.out.println(i);
	}	
}

class Student extends Person{
	private int i = 3;
	private String school = "THU";
	public String getInfo(){
		return super.getInfo() + "\tSchool:" + school;	
	}
	public void testI(){
		System.out.println(super.i);
		System.out.println(i);
	}	
}

public class Test{
	public static void main(String args[]){
		Person p = new Person();
		System.out.println(p.getInfo());	
		p.testI();
		Student s = new Student();
		System.out.println(s.getInfo());
		s.testI();	
	}	
}

