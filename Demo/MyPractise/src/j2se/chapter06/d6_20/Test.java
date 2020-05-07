
public class Test{
	public static void main(String args[]){
		Person p1 = new Person("Tom",34);		
		Person p2 = new Person("Billy");
		Person p3 = new Person(56);
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
	}	
}