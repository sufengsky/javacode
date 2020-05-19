public class TestEnumInSwitch{
	public static void main(String[] args){
		TestEnumInSwitch teis = new TestEnumInSwitch();
		teis.work(Week.FRI);
	}	
	public void work(Week day){
		switch(day){
			case MON:
			case TUE:
			case WED:
			case THU:
			case FRI:
				System.out.println("工作日，去上班!");	
				break;
			case SAT:
				System.out.println("星期六，去购物!");	
				break;
			case SUN:
				System.out.println("礼拜天，去教堂!");	
				break;
			default:
				System.out.println("你有没有搞错!");	
				break;
		}
	}	
}