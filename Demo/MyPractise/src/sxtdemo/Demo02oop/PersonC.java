package sxtdemo.Demo02oop;

public class PersonC {
    int id;
    int age = 20;

    //这个并不是构造函数,写一个这样的函数真的是有点变态
    void PersonC(int _id, int _age) {
        id = _id;
        age = _age;
    }

    public static void main(String[] args) {
        PersonC tom = new PersonC();
        System.out.println(tom.id+" "+tom.age);
        tom.PersonC(1, 25);
        System.out.println(tom.id+" "+tom.age);

        Point2 p = new Point2();
    }
}

class Point2 {

    //如果用户没有定义自己的无参构造函数，则系统会生成一个无参构造函数
    //如果用户自己定义了无参构造函数，则系统不会再为我们定义无参的构造函数

    Point2() {
        System.out.println("Point2");
    }

    int x;
    int y;
}