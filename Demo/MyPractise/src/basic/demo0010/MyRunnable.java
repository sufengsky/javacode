package basic.demo0010;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		Integer i = 0;

		while (i < 5) {
			System.out.print((int) (Math.random() * 10000));
			System.out.println(" "+Thread.currentThread().getName());
			
			i++;
		}

	}

}
