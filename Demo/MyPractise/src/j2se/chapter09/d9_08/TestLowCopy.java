public class TestLowCopy{
	public static void main(String args[]){
		Book b1 = new Book("Java���",30.50,new Person("����",34));
		Book b2 = (Book)b1.clone();
		b2.price = 44.0;
		b2.author.setAge(45);
		b2.author.setName("����");
		b2.bookName = "Java����";
		b1.display();	
		b2.display();	
	}
}