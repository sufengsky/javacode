package j2se.chapter09.d9_09;

public class Person implements Cloneable{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;	
	}
	public void setAge(int age){
		this.age = age;	
	}
	public void setName(String name){
		this.name = name;	
	}	
	public void display(){
		System.out.println("Name:" + name + "\tAge:" + age);	
	}
	public Object clone(){
		Person p = null;
        try{
            p = (Person)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}