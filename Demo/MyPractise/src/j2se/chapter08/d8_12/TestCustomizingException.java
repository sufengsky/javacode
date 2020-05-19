public class TestCustomizingException{
	public void regist(int num) throws MyException {
		if (num < 0) {
			throw new MyException("人数为负值，不合理",3);
		}
		System.out.println("登记人数:" + num );
	}
	
	public void manager() {
		try {
			regist(-100);
		} catch (MyException e) {
			System.out.println("登记失败，出错种类"+e.getId());	
		}
		System.out.print("本次登记操作结束");
	}
	
	public static void main(String args[]){
		new TestCustomizingException().manager();
	}
}