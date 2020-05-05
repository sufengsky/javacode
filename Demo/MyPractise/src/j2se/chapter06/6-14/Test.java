public class Test{
	public void cast(Person p){
		p = new Person();
		//System.out.println(p.getSchool());
		Student stu = (Student)p;
		System.out.println(stu.getSchool()); 
	}
	
	
	public static void main(String[] args){
		Test t = new Test();		
		Student s = new Student();
		s.setSchool("THU");	
		t.cast(s);
	}
}
