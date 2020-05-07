public class MyDate{
	private int day = 17;
	private int month = 2;
	private int year = 2007;
		
	public MyDate(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;	
	}	
	public void setDay(int day){
		this.day = day;    	//不同于	day = day;
	}
	public int getDay(){
		return this.day;	//等价于	return day;
	}
	public void setMonth(int m){
		month = m;	    	//等价于	this.month = m;
	}
	public int getMonth(){
		return month;		//等价于	return this.month;
	}
	public void setYear(int year){
		this.year = year;	
	}
	public int getYear(){
		return year;	
	}
	
	public void setAll(){
		this.setYear(2008);
		this.setMonth(8);
		setDay(8);			//等价于	this.setDay(8);	
	}	
	
	public void display(){
		System.out.println(year + "-" + month + "-" + day);	  //等价于：
		System.out.println(this.year + "-" + this.month + "-" + this.day);
	}	
}