public class Test{ 
	private int i = 5;
	public void m1(){
		i++;
	}
	public void m2(){
		m1();  //合法，等价于 this.m1();
	}
	public static int m3(){		
		i++;
	}
	public static void main(String[] args){
		Test t = new Test();
		t.m2();	
		m3();	//合法，等价于	Test.m3();
	}
}
