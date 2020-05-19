public class TestEnum{
	public static void main(String[] args){
		TestEnum te = new TestEnum();
		te.work(Week.SUN);
	}	
	public void work(Week day){
		if(day.equals(Week.SAT)){
			System.out.println("购物!");
		}else if(day.equals(Week.SUN)){
			System.out.println("祈祷!");
		}else{
			System.out.println("工作!");
		}		
	}
}