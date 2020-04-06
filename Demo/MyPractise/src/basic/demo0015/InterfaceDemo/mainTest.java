package basic.demo0015.InterfaceDemo;

public class mainTest {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        display(circle);

        Shape rectangle=new Rectangle(3,5);
        display(rectangle);

    }

    public static void display(Shape figure) {
        System.out.println("The area is :" + figure.area());
        System.out.println("The circumference is :" + figure.circumference());
    }
}
