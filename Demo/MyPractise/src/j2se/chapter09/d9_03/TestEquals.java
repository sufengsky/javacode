public class TestEquals{
	public static void main(String[] args){
		int i=5,j=5;
		System.out.println(i==j);
		Person p1 = new Person(18);
		Person p2 = new Person(18);
		if ( p1 == p2 ) {
			System.out.println("p1==p2");
		} else {
			System.out.println("p1!=p2");
		}
		
		if ( p1.equals(p2) ) {
			System.out.println("p1 is equal to p2");
		} else {
			System.out.println("p1 is not equal to p2");
		} 
		
		p2 = p1;
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));					
	}	
}