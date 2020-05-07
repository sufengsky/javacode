public class Single{
	private String name;
	private static Single onlyone = new Single();
	
	private Single(){
	}
	public void setName(String name){
		this.name = name;	
	}
	public String getName(){
		return name;	
	}
	public static Single getSingle() {
		return onlyone;
	}
}