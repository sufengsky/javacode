package j2se.chapter06.d6_08;

public class Test{
	public static void main(String[] args){
	      Person p = new Person();
	      p.name = "Tom";
	      p.age = 18;
	      System.out.println(p.getInfo());
	      
	      Student s = new Student();
	      s.name = "Billy";
	      s.age = 34;
	      s.school = "THU";
	      System.out.println(s.getInfo());
	}
}