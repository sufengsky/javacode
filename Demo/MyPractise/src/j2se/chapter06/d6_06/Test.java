public class Test{
	public static void main(String[] args){
		Student s = new Student();
		s.setName("Tom");
		s.setAge(18);
		s.setSchool("THU");	
		System.out.println(s.getInfo() + "\nSchool: " + s.getSchool());
	}
}
