package basic.demo0015;

public class Main {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println(flag);
        byte bmax = Byte.MAX_VALUE;
        byte bmin = Byte.MIN_VALUE;
        System.out.println(bmax);
        System.out.println(bmin);
        int age = 35;
        if (age > 35) {
            System.out.println("your program road is finished , realy?");
        }
//        int[] arrays = {1, 2, 3, 4, 5};
//        string name = "sufeng";
        String[] family = new String[]{"mom", "dad","old brother","yong sister"};
        for (int i = 0; i < family.length; i++) {
            System.out.println(family[i]);
        }
    }
}
