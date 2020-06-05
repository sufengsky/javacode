package j2se.chapter06.d6_27;

public class Person {
	 public static int total;
	 static {
	 	// ---
		total = 100;
		System.out.println("in static block!");
	 }
}
