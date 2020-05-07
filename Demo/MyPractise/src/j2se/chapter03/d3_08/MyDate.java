public class MyDate{
	private int day = 17;
	private int month = 2;
	private int year = 2007;	
	public MyDate(){}
	public MyDate(int d,int m,int y){
		day = d;
		month = m;
		year = y;	
	}	
	public void setDay(int d){
		day = d;	
	}
	public int getDay(){
		return day;	
	}
	public void setMonth(int m){
		month = m;	
	}
	public int getMonth(){
		return month;	
	}
	public void setYear(int y){
		year = y;	
	}
	public int getYear(){
		return year;	
	}
	public void display(){
		System.out.println(year + "-" + month + "-" + day);	
	}	
}