package j2se.chapter03.d3_09;

public class TestMethod {
    public int m1(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public void m2(int c) {
        System.out.println(c);
    }

    public static void main(String args[]) {
        TestMethod tm = new TestMethod();
        int j = tm.m1(3, 4, 5);
        System.out.println(j);
        System.out.println(tm.m1(100, 10, 9));
        tm.m1(1, 2, 3);            //合法，丢弃了返回结果

        tm.m2(6);
        //int k = tm.m2(8);		//非法，m2方法没有返回值
    }
}