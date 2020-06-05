package j2se.chapter15.d15_02;

import java.util.Hashtable;

public class TestHashtable{
	public static void main(String args[]){
		Hashtable<Integer,Employee> ht = new Hashtable<Integer,Employee>();
		ht.put(101,new Employee(101,"张三",5000));
		ht.put(102,new Employee(102,"李四",4800));
		ht.put(106,new Employee(106,"赵六",8620));
		
		Employee e = ht.get(102);
		e.showInfo();
	}	
}