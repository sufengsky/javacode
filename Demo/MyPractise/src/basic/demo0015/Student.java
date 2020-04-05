package basic.demo0015;

/**
 *
 */
public class Student extends Person {

    private String major;
    private double GPA;

    /**
     * @param n
     * @param a
     * @param s
     * @param m
     * @param g
     */
    public Student(String n, int a, String s, String m, double g) {
        super(n, a, s);
        major = m;
        GPA = g;
    }

    public void printStudent() {
        printPerson();
        System.out.println("Major:" + major);
        System.out.println("GPA:" + GPA);
    }
}
