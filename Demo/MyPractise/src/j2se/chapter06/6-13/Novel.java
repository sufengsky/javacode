public class Novel extends Book{
	private String author;
	public void setAuthor(String author){
		this.author = author;	
	}
	public String getAuthor(){
		return author;	
	}
	public void show(){
		super.show();
		System.out.println("Author:" + author);
	}
}