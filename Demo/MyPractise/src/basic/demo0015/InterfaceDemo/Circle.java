package basic.demo0015.InterfaceDemo;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double circumference() {
        return 2 * PI * radius;
    }
}
