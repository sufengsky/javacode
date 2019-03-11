package basic.demo0010;

public class Main {

	/**
	 * 线程基本使用示例
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable threadJob = new MyRunnable();
		Thread thread = new Thread(threadJob);
		//设置子线程的名称
		thread.setName("child thread");

		thread.start();
		try {
			Thread.sleep(500);
			System.out.println("begin thread run");
			System.out.println("thread finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 为当前的线程设置名称
		Thread.currentThread().setName("Main thread");
		System.out.println(Thread.currentThread().getName());

	}

}
