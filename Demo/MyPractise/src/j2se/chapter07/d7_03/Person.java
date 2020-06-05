package j2se.chapter07.d7_03;

public class Person implements Runner{
	public void start(){
		System.out.println("弯腰、蹬腿、咬牙、瞪眼、 开跑");	
	}
	public void run(){
		System.out.println("摆动手臂、 维持直线方向");	
	}
	public void stop(){
		System.out.println("减速直至停止、喝水");	
	} 	
}