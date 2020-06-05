package j2se.chapter15.d15_02;

public class Employee{
	private final int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;	
	}
	public int getId(){
		return id;	
	}
	public String geName(){
		return name;	
	}
	public void setName(String name){
		this.name = name;
	}
	public double getSalary(){
		return salary;	
	}
	public void setSalary(double salary){
		this.salary = salary;	
	}
	public void showInfo(){
		System.out.println(id + "\t" + name + "\t" + salary);	
	}
}