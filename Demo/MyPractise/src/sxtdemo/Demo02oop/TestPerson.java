package sxtdemo.Demo02oop;

class PersonA {
    private String name;
    private int age;
    public void setName(String name) {
    	this.name=name;
    }
    public void setAge(int age) {
    	this.age=age;
    }
    public String getName(){
    	return name;
    }
    public int getAge(){
    	return age;
    }
}

class Student extends PersonA {
    private String school;
    public String getSchool() {
    	return school;
    }
    public void setSchool(String school) {
    	this.school =school;
    } 
}

public class TestPerson {
    public static void main(String arg[]){
        Student student = new Student();
        student.setName("John");
        student.setAge(18);
        student.setSchool("SCH");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSchool());
    }
}