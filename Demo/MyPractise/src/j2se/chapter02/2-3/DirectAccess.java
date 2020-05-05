class Person{
	public int age;	
}

public class DirectAccess{
	public static void main(String[] args){
		Person b = new Person();
		b.age = 40;
		b.age = -3;
		System.out.println(b.age);
	}
}