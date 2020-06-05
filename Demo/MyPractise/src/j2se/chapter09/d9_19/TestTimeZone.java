package j2se.chapter09.d9_19;

import java.util.*;

public class TestTimeZone{
	public static void main(String args[]){
		/*
		String[] ids = TimeZone.getAvailableIDs();
		for(String id:ids){
			System.out.println(id);
		}
		*/
		TimeZone tz0 = TimeZone.getDefault();
		TimeZone tz1 = TimeZone.getTimeZone("PRC");
		TimeZone tz2 = TimeZone.getTimeZone("Pacific/Nauru");
		Calendar c0 = Calendar.getInstance(tz0);
		Calendar c1 = Calendar.getInstance(tz1);
		Calendar c2 = Calendar.getInstance(tz2);
		display(c0);
		display(c1);
		display(c2);

	}
	public static void display(Calendar c){	
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