public class Test {
	public static void main(String[] args) {
		A a = new A();
		for (int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j++){
				int result = j * i;
				System.out.print(j + "x" + i + "=" + result + "\t");	
				
			}
			System.out.println();
		}
	}
}