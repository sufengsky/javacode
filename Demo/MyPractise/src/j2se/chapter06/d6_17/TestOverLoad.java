class Tool{
	public void display(int i){
		System.out.println("���������" + i);
	}
	public void display(double d){
		System.out.println("�����������" + d);
	}
	public void display(String s){
		System.out.println("����ı���" + s);
	}		
}

public class TestOverLoad{	
	public static void main(String args[]){
		Tool t = new Tool();
		t.display(3);
		t.display(3.14);
		t.display("Hello,��ã�");	
	}	
}