package j2se.chapter02.d2_3;

class Person {
    public int age;
}

public class DirectAccess {
    public static void main(String[] args) {
        Person b = new Person();
        b.age = 40;
        b.age = -3;
        System.out.println(b.age);
    }
}