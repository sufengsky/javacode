public class Test{
	public static void main(String[] args) {
		System.out.println(Person.getTotalPerson());
		Person p1 = new Person();
		System.out.println(p1.getTotalPerson());
		System.out.println(Person.getTotalPerson());
	}
}