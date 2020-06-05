package j2se.chapter04.d4_28;

public class Test{
	public static void main(String args[]){
		Test t = new Test();
		System.out.println(t.m1(40));
		System.out.println(t.m2(40));
	}
	
	public int m1(int n){
		int p1=1,p2=1,c=0;
		for(int i=3;i<=n;i++){
			c = p1 + p2;
			p1 = p2;
			p2 = c;	
		}
		return p2;
	}
	
	public int m2(int n){
		if(n==1 || n==2)
			return 1;
		else {
			int result = m2(n-1) + m2(n-2);	
			return result;
		}
	}
}
