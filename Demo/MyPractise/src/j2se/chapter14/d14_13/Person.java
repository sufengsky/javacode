package j2se.chapter14.d14_13;

import java.io.Serializable;
public class Person implements Serializable{
	private static int resource = 100;
	private String name ;
	private transient String password;

	public Person(String name,String password){
		this.name = name;
		this.password = password;
	}

	public static void setResource(int resource){
		Person.resource = resource;
	}
	public static int getResource(){
		return resource;	
	}
	public String toString(){
		return "name:" + name + "\tpassword:" + password;
	}
}