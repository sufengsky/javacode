package basic.demo0011;


public class Main {

	/**
	 * 多线程导致的并发问题演示
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TestSync job = new TestSync();

		Thread a = new Thread(job);
		Thread b = new Thread(job);

		a.start();
		b.start();
	}

}
