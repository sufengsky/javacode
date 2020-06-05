package j2se.chapter09.d9_09;

public class Book implements Cloneable{
	String bookName;
	double price;
	Person author;
	public Book(String bn,double price,Person author){
		bookName = bn;
		this.price = price;
		this.author = author;	
	}	
	public Object clone(){
		Book b = null;
        try{
            b = (Book)super.clone();            
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        b.author = (Person)author.clone();
        return b;
    }
	public void display(){
		System.out.print(bookName + "\t" + price + "\t") ;
		author.display();	
	}
}