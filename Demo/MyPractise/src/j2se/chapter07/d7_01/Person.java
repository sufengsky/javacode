public class Person extends Animal{
	private String name;
	public void setName(String name){
		this.name = name;	
	}
	public String getName(){
		return name;	
	}
	public void eat(){
		System.out.println("洗手->烹饪->摆餐具->吃喝->收摊儿---");	
	}
}