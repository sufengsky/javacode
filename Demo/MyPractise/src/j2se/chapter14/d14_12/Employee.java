import java.io.Serializable;

public class Employee implements Serializable{
	private String name; 
	private int age;
	private String dept;

	//public Employee(){}
	public Employee(String name,int age,String dept){
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	public String getName(){
		return name;	
	}
	public void setAge(int age){
		this.age = age;	
	}
	public int getAge(){
		return age;	
	}
	public void setDept(String dept){
		this.dept = dept;	
	}
	public String getDept(){
		return dept;	
	}
	public void showInfo(){
		System.out.println("name:" + name + "\tage:" + age + "\tdept:" + dept);
	}
}

