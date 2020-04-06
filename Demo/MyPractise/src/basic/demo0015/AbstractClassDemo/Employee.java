package basic.demo0015.AbstractClassDemo;

public abstract class Employee {

    public abstract void computerRasise();

    private String name;
    private String title;
    protected double salary;

    public Employee(String n, String t, double s) {
        name = n;
        title = t;
        salary = s;
    }

    public void printInfo() {
        System.out.println("Name:" + name);
        System.out.println("Title:" + title);
        System.out.println("Salary:" + salary);
    }
}
