package j2se.chapter06.d6_12;

public class Test{
	public void show(Person p){
		//---	
		System.out.println(p.getInfo());
	}	
	public static void main(String[] args){
		Test t = new Test();
		
		Person p = new Person();
		t.show(p);
		
		Student s = new Student();
		t.show(s);
	}
}
