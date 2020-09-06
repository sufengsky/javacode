package sxtdemo.Demo02oop.TestFinal;

public class TestFinal {
	public static void main(String[] args) {
		T t = new T();
		//t.i = 8;  //不能对使用final关键字标识的变量赋值
	}
}

 class T {
	final int i = 8;
	//使用final标识的方法不能被子类重写
	public final void m() {
		//j = 9;
	}
}

////使用final标识的类不能再被继承
//class TT extends T {
//
//}
