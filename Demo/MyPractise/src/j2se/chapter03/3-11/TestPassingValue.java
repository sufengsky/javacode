public class TestPassingValue{
	public void test(MyDate m){
		m.setDay(22);			
	}
	
	public static void main(String args[]){
		MyDate d1 = new MyDate(8,8,2008);
		d1.display();
				
		MyDate d2 = d1;
		d2.setYear(2009);
		d1.display();		
		
		TestPassingValue tpv = new TestPassingValue();
		tpv.test(d2);
		d1.display();		
	}
}