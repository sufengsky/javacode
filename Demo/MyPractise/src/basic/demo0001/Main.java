package basic.demo0001;

public class Main {
	public static void main(String[] args) {

		System.out.println(DateUtil.getCurDate());

		// System.out.println(DateUtil.dateToDateString(new
		// Date(),"yyyy-MM-dd HH:mm:ss"));

		// System.out.println("pathSeparatorChar = " + File.pathSeparatorChar);
		
		//获取当前程序运行所在的目录
		System.out.println(System.getProperty("user.dir"));
	}
}
