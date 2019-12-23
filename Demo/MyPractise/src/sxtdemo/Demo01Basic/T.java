package sxtdemo.Demo01Basic;

public class T {

    static int i;

    void m(int i) {
        this.i = i;
    }

    void m(short i) {
        System.out.println("short");
    }


    public static void main(String[] args) {
        i = 8;
        T t = new T();
        t.m(5);
    }
}