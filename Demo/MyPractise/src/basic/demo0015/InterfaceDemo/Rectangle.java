package basic.demo0015.InterfaceDemo;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double circumference() {
        return 2 * (height + width);
    }
}
