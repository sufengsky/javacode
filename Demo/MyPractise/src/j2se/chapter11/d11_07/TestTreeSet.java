package j2se.chapter11.d11_07;

import java.util.TreeSet;
import java.util.Iterator;

public class TestTreeSet{
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("orange");
		ts.add("banana");
		ts.add("apple");
		ts.add("grape");

		Iterator it = ts.iterator();
		while(it.hasNext()){
			String fruit = (String)it.next();
			System.out.println(fruit);	
		}
	}
}