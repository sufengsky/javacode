package basic.demo0015.AbstractClassDemo;

public class Developer extends Employee {

    private int numOfPrograms;

    public Developer(String n, String t, double s, int np) {
        super(n, t, s);
        numOfPrograms = np;
    }

    @Override
    public void computerRasise() {
        salary += salary * 0.5 + numOfPrograms * 25;
    }
}
