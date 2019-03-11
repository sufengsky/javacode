package basic.demo0002;

/***
 * 练习使用myeclipse生成get与set属性方法的功能
 *
 */
public class Dog {
	
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	String name;
	int age;
	int type;
}
