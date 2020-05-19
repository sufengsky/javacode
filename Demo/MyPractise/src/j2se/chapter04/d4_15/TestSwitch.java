public class TestSwitch{
	public static void main(String args[]){
		TestSwitch tni = new TestSwitch();
		String s = tni.convert(4);
		System.out.println(s);
	}
	
	public String convert(int n){
		String day = "";
		switch(n){
			case 1: 
				day = "星期一";	
				break;
			case 2: 
				day = "星期二";	
				break;
			case 3: 
				day = "星期三";	
				break;
			case 4: 
				day = "星期四";	
				break;
			case 5: 
				day = "星期五";	
				break;
			case 6: 
				day = "星期六";	
				break;
			case 0: 
				day = "星期日";	
				break;
			default:
				day = "非法";
				break;
		}	
		return day;
	}		
}