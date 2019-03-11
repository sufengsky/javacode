package basic.demo0011;

public class TestSync implements Runnable {
	private int balance;

	public void run() {
		for (int i = 0; i < 50; i++) {
			increment();
			System.out.println("balance is " + balance);
		}
	}

	// 加下synchronized关键字表示方法的操作是原子操作，从而避免多线程导致的并发问题
	public synchronized void increment() {
		int i = balance;
		balance = i + 1;
	}
}
