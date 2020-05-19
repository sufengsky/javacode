public class Person{
	private String name;
	private double free = 1200;
	
	public Person(String name,double free){
		this.name = name;
		this.free = free;	
	}
	
	public void tax(double d){
		final double rate = 0.1;
		class B{
			public double tax(double salary){
				return (salary-free) * rate; 
			} 	
		}
		B b = new B();
		System.out.println("您的本次薪酬: " + d + "\n    免税额度: " + free+"\n    应纳税额: " + b.tax(d));			
	}
}