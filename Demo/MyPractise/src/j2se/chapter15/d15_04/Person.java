package j2se.chapter15.d15_04;

public class Person<T>{
	private final int id;
	private T secrecy;
	public Person(int id){
		this.id = id;	
	}
	public int getId(){
		return id;	
	}
	public void setSsecrecy(T secrecy){
		this.secrecy = secrecy;	
	}
	public  T getSecrecy(){
		return secrecy;	
	}
}