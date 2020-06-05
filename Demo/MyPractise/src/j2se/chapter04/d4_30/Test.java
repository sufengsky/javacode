package j2se.chapter04.d4_30;

public class Test{
	private int n = 0;
	public static void main(String args[]){
		Test t = new Test();
		t.a(10000);
	}

	public void a(double d){
		if(d >= 20000){
			System.out.println(n);	
		}else{
			n++;			
			d = d*1.1;
			this.b(d);
		}		
	}
	
	public void b(double m){
		m = m-100;	
		this.a(m);
	}
}