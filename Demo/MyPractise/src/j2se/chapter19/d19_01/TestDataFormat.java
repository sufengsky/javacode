package j2se.chapter19.d19_01;

import java.util.*;
import java.text.DateFormat;
import java.text.NumberFormat;

public class TestDataFormat{
	public static void main(String args[]){
		Date now = new Date();
		Locale locale = Locale.getDefault();
		System.out.println("Locale: " + locale);
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, locale);		
		System.out.println(df.format(now));

		double d = 1234.56;	
		NumberFormat nf1 = NumberFormat.getInstance();
		System.out.println(nf1.format(d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();
		System.out.println(nf2.format(d));		
	}
}