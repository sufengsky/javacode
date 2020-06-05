package j2se.chapter06.d6_06;

public class Soldier extends Person{
	private String type;	//军兵种，如陆军/海军/空军等
	public void setType(String type){
		this.type = type ;	
	}
	public String getType(){
		return type;	
	}	
}
