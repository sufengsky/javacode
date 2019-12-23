package sxtdemo.Demo01Basic;

public class TestBreak {
  public static void main(String args[]) {
    int stop = 4;
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
       //当i等于stop时，退出循环
       if (i == stop) {
       		break;
      }
    }
  }
}
