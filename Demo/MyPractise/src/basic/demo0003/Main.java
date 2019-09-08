package basic.demo0003;

import java.beans.Introspector;
import java.util.ArrayList;

public class Main {
	/**
	 * 演示使用for 循环来遍历一个数组
	 * 
	 */
	public static void main(String[] args) {

//		int[] a = new int[10];
//		a[0] = 1;
//		a[1] = 2;
//		
//		//最初的写法
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
//		
//		//新的写法
//		for (int x : a) {
//			System.out.println(x);
//		}
		
		
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(8);
		ar.add(10);
		
		for(int x : ar){
			System.out.println(x);
		}
		ar.remove(ar.indexOf(8));
		for(int x : ar){
			System.out.println(x);
		}
	}

}
