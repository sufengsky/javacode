public class TestEquals3{
	public static void main(String[] args){
		Person p1 = new Person(18);
		Person p2 = new Person(18);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));					
	}	
}