package j2se.chapter06.d6_16;

class A{
	public Person getAssistor(){
		Person p = new Person();
		//-----
		return p;
	}	
}

class B extends A{
	public Student getAssistor(){
		Student s = new Student();
		s.setName("Nancy");
		s.setAge(18);
		s.setSchool("THU");
		return s;
	}	
}

public class TestCovariantReturnType{
	public static void main(String[] args){
		B b = new B();
		Student stu = b.getAssistor();
		System.out.println(stu.getSchool());	
	}	
}