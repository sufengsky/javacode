package j2se.chapter08.d8_03;

public class TestVirtualMachineError{
	public static void main(String[] args) {
		TestVirtualMachineError tvme = new TestVirtualMachineError();
		tvme.f(100000);
	}
	
	public int f(int n){
		if(n<=0)
			return 0;
		int k = n*this.f(n-1);
		return k;
	}
}