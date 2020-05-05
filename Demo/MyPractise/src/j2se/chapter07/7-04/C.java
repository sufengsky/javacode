interface A{
	public void m1(int i);
}
interface B{
	public void m1(int i);
}
class C implements A,B{
	public void m1(int i){
		System.out.println("i=" + i);
	}
	public static void main(String args[]){
		C c = new C();
		c.m1(3);
	}
}
