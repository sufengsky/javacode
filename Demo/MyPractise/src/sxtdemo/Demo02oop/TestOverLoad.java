package sxtdemo.Demo02oop;

public class TestOverLoad {
	public static void main(String[] args) {
		PersonB p = new PersonB();
	PersonB p1 = new PersonB(400);
		PersonB p2 = new PersonB(2, 500);
		p.info();
		p.info("ok");
	}
}

class PersonB {

	PersonB() {
		id = 0;
		age = 20;
	}

	PersonB(int _id) {
		id = _id;
		age = 23;
	}

	PersonB(int _id, int _age) {
		id = _id;
		age = _age;
	}

  private int id;
  private int age = 20;
  public int getAge() {return age;}
  public void setAge(int i) {age = i;}
  public int getId() {return id;}
  
  void info() {
  	System.out.println("my id is : " + id);
  }
  
  void info(String t) {
  	System.out.println(t + " id " + id);
  }
}