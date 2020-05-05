class Person{
	private String name;
	private int age;
	
	public Person(String n){
		name = n;	
	}		
	public String getName(){
		return name;	
	}
	public void setAge(int i){
		if(i>=0 && i<=120){
			age = i;	
		}	
	}	
	public int getAge(){
		return age;	
	}
}

public class Encapsulation{
	public static void main(String[] args){
		Person b = new Person("Tom");
		b.setAge(34);
		b.setAge(-3);
		System.out.println(b.getName() + "--" + b.getAge());
	}
}