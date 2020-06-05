package j2se.chapter09.d9_02;

public class TestOverride{
	public static void main(String[] args){
		Person p1 = new Person(18);
		System.out.println(p1.hashCode());
		System.out.println(p1);		//等价于
		System.out.println(p1.toString());	
	}	
}