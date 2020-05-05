public class TestInteger{
	public static void main(String[] args){
		int a = 39;
		int b = 0x4b;
		int c = 021;
		int d = a + 0x12 + 012;  //µÈ¼ÛÓÚd=39 + 18 + 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}	
}