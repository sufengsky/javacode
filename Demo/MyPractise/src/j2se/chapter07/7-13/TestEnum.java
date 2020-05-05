public class TestEnum{
	public static void main(String[] args){
		TestEnum te = new TestEnum();
		te.work(Week.SUN);
	}	
	public void work(Week day){
		if(day.equals(Week.SAT)){
			System.out.println("¹ºÎï!");
		}else if(day.equals(Week.SUN)){
			System.out.println("Æíµ»!");
		}else{
			System.out.println("¹¤×÷!");
		}		
	}
}