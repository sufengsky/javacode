package j2se.chapter04.d4_25;

public class TestContinue{
	public static void main(String args[]){
		for (int i = 0; i < 10; i++) {
			if ((i%3) ==0)
				continue;
			System.out.print(i + "\t");
		}
	}
}
