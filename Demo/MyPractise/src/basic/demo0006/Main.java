package basic.demo0006;

public class Main {

	/**
	 * 面向对象里的继承关系表达
	 */
	public static void main(String[] args) {

		Tea tea = new BlackTea();

		System.out.println(tea.GetDescription());

		tea = new OolongTea();

		System.out.println(tea.GetDescription());

		// 变量的类型判断
		if (tea instanceof Tea) {
			System.out.println("true");
		}
		// java中所有的对象都继承自Object类
		if (tea instanceof Object) {
			System.out.println("true");
		}

		Object object = new BlackTea();
		if (object instanceof Tea) {
			Tea t = (Tea) object;
			System.out.println(t.GetDescription());
		}
	}
}
