public class TestObject{
	public static void main(String[] args){
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "����";
		p1.age = 18;
		
		p2.setName("����");
		p2.setAge(33);
		
		p1.sleep();
		p2.sleep();
		System.out.println(p1.getAge());
		System.out.println(p2.age);
	}	
}