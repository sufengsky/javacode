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
			System.out.println("����Graduate���ͼ����������Ͷ���!");	
		}else if(p instanceof Student){
			System.out.println("����Student���ͼ����������Ͷ���!");
		}else{
			System.out.println("����Person���ͼ����������Ͷ���!");	
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
