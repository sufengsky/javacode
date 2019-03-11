package basic.demo0012;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	/**
	 * 演示如何对一个ArrayList进行排序
	 */
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("sufeng");
		strings.add("yezhen");
		strings.add("xibao");
		strings.add("hanbao");

		Collections.sort(strings);//ArrayList本身没有排序的方法，所以使用了Collections类的sort方法对strings进行排序

		for (String string : strings) {
			System.out.println(string);
		}

	}
	
	
	

}
