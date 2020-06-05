package j2se.chapter09.d9_20;

import java.util.*;
public class TestGregorianCalendar{
	public static void main(String args[]){
		GregorianCalendar gc0 = new GregorianCalendar();
		GregorianCalendar gc1 = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles"));
		GregorianCalendar gc2 = new GregorianCalendar(2008,8,18);
		display(gc0);
		display(gc1);
		display(gc2);
		System.out.println(gc0.isLeapYear(2008));
	}
	public static void display(GregorianCalendar c){	
		String s = 	c.getTimeZone().getDisplayName() + "\t" + 
					c.get(Calendar.YEAR) + "-" + 
				   (c.get(Calendar.MONTH) + 1) + "-" +
					c.get(Calendar.DATE) + " " +
					c.get(Calendar.HOUR_OF_DAY) + ":" +
					c.get(Calendar.MINUTE) + ":" +
					c.get(Calendar.SECOND) ; 
		System.out.println(s);			
	}		
}