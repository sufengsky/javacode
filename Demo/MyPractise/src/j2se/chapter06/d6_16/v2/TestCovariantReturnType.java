class B extends A{
	public Person getAssistor(){
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
		Student stu = (Student)b.getAssistor();
		System.out.println(stu.getSchool());	
	}	
}