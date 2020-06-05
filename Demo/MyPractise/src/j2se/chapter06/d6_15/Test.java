package j2se.chapter06.d6_15;

class Person{
	//---
}

class Student extends Person{
	//---;
}

class Graduate extends Student{
	//---;	
}

class Tool{
	public void distribute(Person p){
		if(p instanceof Graduate){
			Graduate g = (Graduate)p;  
			//------
			System.out.println("处理Graduate类型及其子类类型对象!");	
		}else if(p instanceof Student){
			System.out.println("处理Student类型及其子类类型对象!");
		}else{
			System.out.println("处理Person类型及其子类类型对象!");	
		}	
	}
}

public class Test{
	public static void main(String[] args){
		Tool t = new Tool();		
		Student s = new Student();
		t.distribute(s);
	}
}
