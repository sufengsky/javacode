class A {
	private int s;
	public class B{
		public void mb() {
			s = 100;     
			System.out.println("���ڲ���B��s=" + s);
		}
	}
	public void ma() {
		B i = new B();
		i.mb();
	}
}

public class TestInner {	
	public static void main(String args[]){
		A o = new A();
		o.ma();
	}
} 
