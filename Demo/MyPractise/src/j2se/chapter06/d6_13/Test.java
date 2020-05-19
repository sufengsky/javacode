public class Test{
	public static void main(String args[]){

		System.out.println("----------正常方法调用---------");
		Test t = new Test();		
		Book b = new Book();
		b.setName("English Language");
		b.setPrice(43);
		t.process(b);
		
		System.out.println("----------需方法调用---------");
		Novel v = new Novel();
		v.setName("Great Expectations");
		v.setPrice(35.48);
		v.setAuthor("Charles Dickens");
		t.process(v);
	}
	
	public void process(Book b){
		//其它代码
		b.show();	
	}
}