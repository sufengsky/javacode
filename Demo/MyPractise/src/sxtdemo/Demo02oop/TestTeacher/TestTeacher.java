package sxtdemo.Demo02oop.TestTeacher;

class Person {
    private String name;
    private String location;

    Person(String name) {
        this.name = name;
        location = "beijing";
    }

    Person(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String info() {
        return "name: " + name + " location: " + location;
    }
}

class Teacher extends Person {
    private String capital;

    Teacher(String name, String capital) {
        this(name, "beijing", capital);
    }

    Teacher(String n, String l, String capital) {
        super(n, l);
        this.capital = capital;
    }

    public String info() {
        return super.info() + "capital " + capital;
    }
}

class Student extends Person {
    private String school;

    Student(String name, String school) {
        this(name, "beijing", school);
    }

    Student(String n, String l
            , String school) {
        super(n, l);
        this.school = school;
    }

    public String info() {
        return super.info() + " school: " + school;
    }
}

public class TestTeacher {
    public static void main(String[] args) {
        Person p1 = new Person("A");
        System.out.println(p1.info());

        Person p2 = new Person("B", "shanghai");
        System.out.println(p2.info());

        Student s1 = new Student("C", "S1");
        System.out.println(s1.info());

        Student s2 = new Student("C", "shanhai", "S2");
        System.out.println(s2.info());

        Teacher t1 = new Teacher("D", "Professor");
        System.out.println(t1.info());
    }
}
