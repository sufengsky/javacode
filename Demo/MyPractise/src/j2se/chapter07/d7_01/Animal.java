package j2se.chapter07.d7_01;

public abstract class Animal{
	private int age;
	public void setAge(int age){
		this.age = age;	
	}
	public int getAge(){
		return age;	
	}
	public abstract void eat();
}