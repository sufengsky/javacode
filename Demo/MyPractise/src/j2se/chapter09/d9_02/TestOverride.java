public class TestOverride{
	public static void main(String[] args){
		Person p1 = new Person(18);
		System.out.println(p1.hashCode());
		System.out.println(p1);		//�ȼ���
		System.out.println(p1.toString());	
	}	
}