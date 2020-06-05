package j2se.chapter06.d6_11;

import java.util.*;
public class Test{
	public static void main(String[] args){
		Person p = new Student();
		System.out.println(p.getInfo());
		
		Object o = "Hello";
		o = new Date();
		o = new Person();
		o = new Student();
	}
}
