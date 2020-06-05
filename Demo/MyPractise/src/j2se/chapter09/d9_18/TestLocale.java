package j2se.chapter09.d9_18;

import java.util.*;

public class TestLocale{
	public static void main(String args[]){
		Locale defaultLocale = Locale.getDefault();		
		System.out.println(defaultLocale);
		System.out.println(defaultLocale.getLanguage());
		System.out.println(defaultLocale.getCountry());
		System.out.println(defaultLocale.getDisplayName());
		System.out.println(defaultLocale.getDisplayLanguage());
		System.out.println(defaultLocale.getDisplayCountry());
		
		Locale d1 = new Locale("en","US");
		System.out.println(d1);
		System.out.println(d1.getDisplayName());

		Locale d2 = new Locale("zh","TW");
		System.out.println(d2);
		System.out.println(d2.getDisplayName());
		System.out.println(d2.getDisplayName(d2));	
	}	
}