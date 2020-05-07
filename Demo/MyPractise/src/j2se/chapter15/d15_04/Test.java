public class Test{
	public static void main(String[] args){
		Person<String> p1 = new Person<String>(101);
		p1.setSsecrecy("芝麻开门");		
		String s = p1.getSecrecy();
		System.out.println(p1.getId() + "\t密码是:" + s);
		
		Person<Double> p2 = new Person<Double>(102);
		p2.setSsecrecy(8700.45);
		double money = p2.getSecrecy();
		System.out.println(p2.getId() + "\t秘密资金数额:" + money);
	}
}
