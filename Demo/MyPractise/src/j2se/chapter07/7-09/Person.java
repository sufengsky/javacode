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
		System.out.println("���ı���н��: " + d + "\n    ��˰���: " + free+"\n    Ӧ��˰��: " + b.tax(d));			
	}
}