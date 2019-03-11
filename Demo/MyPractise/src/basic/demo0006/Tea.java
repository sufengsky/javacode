package basic.demo0006;

public class Tea {
	
	public Tea() {
		 System.out.println("Tea中的构造函数");
	}
	/**
	 * 
	 * @return
	 */
	public String getAddress() {
		return Address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		Address = address;
	}

	/**
	 * 
	 * @return
	 */
	public String getType() {
		return Type;
	}

	/**
	 * 设置
	 * 
	 * @param type
	 */
	public void setType(String type) {
		Type = type;
	}

	private String Address;
	private String Type;
	
	/**
	 * 获取当前茶叶的描述
	 * @return
	 */
	public  String GetDescription() {
		return "茶";
	}
}
