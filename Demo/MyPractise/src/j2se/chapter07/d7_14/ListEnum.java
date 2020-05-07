public class ListEnum{
	public static void main(String[] args){
		Week[] days = Week.values();
		for(Week d:days){
			System.out.println(d);
		}
	}	
}