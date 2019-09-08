package basic.demo0006;

/**
 * 红茶
 * 
 * @author Administrator
 * 
 */
public class BlackTea extends Tea {
	public BlackTea() {
		System.out.println("BlackTea中的构造函数");
	}

	@Override
	public String GetDescription() {
		// System.out.println(super.GetDescription()); //调用父类的方法演示
		return "红茶";
	}
}
