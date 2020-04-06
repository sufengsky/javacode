package basic.demo0015.AbstractClassDemo;

public class Manager extends Employee {
    private static final double BONUS = 2500;

    public Manager(String n, String t, double s) {
        super(n, t, s);
    }

    @Override
    public void computerRasise() {
        salary += salary * 0.5 + BONUS;
    }
}
