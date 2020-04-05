package basic.demo0015;

/***
 *
 * 继续示例中用的基类
 */
public class Person {
    private String name;
    private int age;
    private String ssn;

    /**
     *
     * @param name
     * @param age
     * @param ssn
     */
    public Person(String name, int age, String ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    /**
     * 打印
     */
    public void printPerson() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("social security:" + ssn);
    }
}
