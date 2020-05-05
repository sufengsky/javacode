public class Student extends Person{
	private String school;
	
	public Student(String name,int age,String school){
		super(name,age);
		this.school = school;	
	}	
	
	public Student(String name,String school){
		super(name);
		this.school = school;	
		
	}
	
	public Student(String name,int age){
		this(name,age,null);	
	}
	public Student(String school){
		//super();
		this.school = school;
	}
}