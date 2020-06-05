package j2se.chapter06.d6_17;

class Tool{
	public void display(int i){
		System.out.println("输出整数：" + i);
	}
	public void display(double d){
		System.out.println("输出符点数：" + d);
	}
	public void display(String s){
		System.out.println("输出文本：" + s);
	}		
}

public class TestOverLoad{	
	public static void main(String args[]){
		Tool t = new Tool();
		t.display(3);
		t.display(3.14);
		t.display("Hello,你好！");	
	}	
}