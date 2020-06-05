package j2se.chapter06.d6_24;

public class Person{
	private int id;
	public static int total = 0;
	
	public Person(){
		total ++;
		id = total;		
	}	
}