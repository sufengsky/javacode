package j2se.chapter06.d6_30.v2;

public class Single{
	private String name;
	private static Single onlyone;
	
	public void setName(String name){
		this.name = name;	
	}
	public String getName(){
		return name;	
	}
	public static Single getSingle() {
		if(onlyone == null){
			onlyone = new Single();	
		}
		return onlyone;
	}
}