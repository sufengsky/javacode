public class Person{	
	private int id;
	public static int total = 0;
	
	public Person(){
		total ++;
		id = total;		
	}	
}