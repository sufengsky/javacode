package j2se.chapter16.d16_01;

public class TestThread1 {
	public static void main(String args[]) {
		Runner1 r = new Runner1();
		Thread t = new Thread(r);
		t.start();
	}
}

class Runner1 implements Runnable {
	public void run() {
		for(int i=0; i<30; i++) {	
			System.out.println("No. " + i);
		}
	}
}
