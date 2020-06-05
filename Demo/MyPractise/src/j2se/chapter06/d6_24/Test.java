package j2se.chapter06.d6_24;

public class Test {
	public static void main(String args[]) {
		Person.total = 100;
		System.out.println(Person.total);
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(Person.total);
	}
}