public class Test{
	public static final String country = "China";	
	private static int totalNumber = 1000;
	private final int id;	
	
	public Test(){
		id = ++totalNumber;
	}	
	public int getId(){
		return id;	
	}
	public int getTotalNumber(){
		return totalNumber;	
	}	
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.country + "\t" + t.getId());		
		final int i = 10;
		final int j;
		j = 20;
		j = 30; //·Ç·¨
	}
}
