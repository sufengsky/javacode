package j2se.chapter04.d4_16;

public class TestSwitch2{
	public static void main(String args[]){
		TestSwitch2 ts = new TestSwitch2();
		int days = ts.getDaysOfMonth(2008,2);
		System.out.println(days);
	}
	
	public int getDaysOfMonth(int year,int month){
		int num = 0;
		switch(month){
			case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                num = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                num = 30;
                break;
            case 2:
                num = this.isLeapYear(year)?29:28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
       	}	
		return num;
	}	
	
	public boolean isLeapYear(int year){
		if((year%4 == 0) && (year%100 != 0))
			return true;
		else if(year%400 == 0)
			return true;
		else
			return false;	
	}	
}