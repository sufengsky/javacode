public class TestMethod{
	public int m1(int a,int b,int c){
		int result = a + b + c;
		return result;	
	}
	
	public void m2(int c){
		System.out.println(c);	
	}
	
	public static void main(String args[]){
		TestMethod tm = new TestMethod();
		int j = tm.m1(3,4,5);
		System.out.println(j);
		System.out.println(tm.m1(100,10,9));   	
		tm.m1(1,2,3);      		//�Ϸ��������˷��ؽ��
		
		tm.m2(6);			
		//int k = tm.m2(8);		//�Ƿ���m2����û�з���ֵ	
	}
}