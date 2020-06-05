package j2se.chapter16.d16_15;

public class SyncStack{  //支持多线程同步操作的堆栈的实现
	private int index = 0;
	private char []data = new char[6];	
	public synchronized void push(char c){
		while(index == data.length){
		try{
				this.wait();
			}catch(InterruptedException e){}
			}
		this.notify();
		data[index] = c;
		index++;
		System.out.println("produced："+c);
	}
	public synchronized char pop(){
		while(index ==0){
			try{
				this.wait();
			}catch(InterruptedException e){}
			    	}
		this.notify();
		index--;
		System.out.println("消费："+data[index]);
		return data[index];
	}
}

