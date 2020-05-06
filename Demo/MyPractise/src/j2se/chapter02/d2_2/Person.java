package j2se.chapter02.d2_2;

public class Person{
	public String name = "无名氏";
	public int age;
	public void setName(String n){
		name = n;
	}	
	public String getName(){
		return name;	
	}	
	public void setAge(int a){
		age = a;	
	}
	public int getAge(){
		return age;	
	}	
	public void sleep(){
		System.out.println(name + "在睡觉,呼噜噜!");	
	} 
}