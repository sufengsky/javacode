public class Test{
	public static void main(String[] args) {
		final Person p1 = new Person("Tom",18);
		p1.display();
		p1 = new Person("Nancy",26);  //非法
		p1.setAge(34); 
		p1.display();
	}
}