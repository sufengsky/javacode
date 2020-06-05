package j2se.chapter11.d11_14;

import java.util.List;
import java.util.Arrays;

public class TestArrays{
	public static void main(String[] args) {
		Integer[] a = {3,25,12,79,48};
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int idx = Arrays.binarySearch(a,25);
		System.out.println(idx);
		
		List list = Arrays.asList(3,4,5);
		System.out.println(list);
		list.set(2,66);
		System.out.println(Arrays.toString(a));
	}
}