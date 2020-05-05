public class TestClone{
	public static void main(String args[]){
		Person p1 = new Person("Tom",18);
		Person p2 = (Person)p1.clone();
		System.out.println(p1 == p2);
		p2.setAge(34);
		p2.display();
		p1.display();
	}
}