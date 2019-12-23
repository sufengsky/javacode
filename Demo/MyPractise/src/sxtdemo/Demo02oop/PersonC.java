package sxtdemo.Demo02oop;

public class PersonC {
    int id;
    int age = 20;

    void PersonC(int _id, int _age) {
        id = _id;
        age = _age;
    }

    public static void main(String[] args) {
        PersonC tom = new PersonC();
        tom.PersonC(1, 25);
        //Person jerry = new Person();
        Point2 p = new Point2();
    }
}

class Point2 {
    Point2() {
    }

    int x;
    int y;
}