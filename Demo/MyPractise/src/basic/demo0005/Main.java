package basic.demo0005;

public class Main {

	/**
	 * 数据类型之间的转换
	 */
	public static void main(String[] args) {
		String strNum = "21";

		//将数字字符串转换为整形数据
		int num = Integer.parseInt(strNum);

		num = num - 1;

		System.out.println(num);
	}

}
