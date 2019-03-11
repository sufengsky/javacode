package basic.demo0013;

public class Person implements Comparable<Person> {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;
	private int age;
	
	@Override
	public int compareTo(Person o) {
		 return this.name.compareTo(o.name);
	}
}
