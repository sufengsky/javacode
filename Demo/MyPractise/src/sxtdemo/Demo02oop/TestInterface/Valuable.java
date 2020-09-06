package sxtdemo.Demo02oop.TestInterface;

public interface Valuable {
    double getMoney();
}

interface Protectable {
    void beProtected();
}

interface A extends Protectable {
    void m();

    void getMoney();
}

abstract class Animal {
    private String name;

    abstract void enjoy();
}

class GoldenMonkey extends Animal implements Valuable, Protectable {
    public double getMoney() {
        return 10000;
    }

    public void beProtected() {
        System.out.println("live in the room");
    }

    public void enjoy() {

    }

    public void test() {
        Valuable v = new GoldenMonkey();
        v.getMoney();
        Protectable p = (Protectable) v;
        p.beProtected();
    }
}

class Hen implements A {
    @Override
    public void m() {
        System.out.println("hen m method");
    }

    @Override
    public void getMoney() {

    }

    public void beProtected() {
    }

}
