package j2se.chapter06.d6_13;

public class Book{
	private String name;
	private double price;
	
	public void setName(String name){
		this.name = name;	
	}
	public String getName(){
		return name;	
	}
	public void setPrice(double price){
		this.price = price;	
	}
	public double getPrice(){
		return price;	
	}
	public void show(){
		System.out.println("BookName:" + name + "\nPrice:" + price);
	}
}