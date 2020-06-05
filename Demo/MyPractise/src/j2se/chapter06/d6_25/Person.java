package j2se.chapter06.d6_25;

public class Person {
	private int id;
	private static int total = 0;
	public Person() {
	 	total++;
		id = total;
	}	
	public int getId(){
		return id;	
	}
	public static int getTotalPerson() { 
		return total;
	}
}
