public class TestLowCopy{
	public static void main(String args[]){
		Book b1 = new Book("Java编程",30.50,new Person("张三",34));
		Book b2 = (Book)b1.clone();
		b2.price = 44.0;
		b2.author.setAge(45);
		b2.author.setName("李四");
		b2.bookName = "Java开发";
		b1.display();	
		b2.display();	
	}
}