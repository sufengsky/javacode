public class TestConversion{
	public static void main(String args[]){
		int i1 = 1234567891;
		float f = i1;    //�Ϸ�������Ȼ���ܴ��ھ�����ʧ
		System.out.println(f);
		double d1 = i1;	//�Ϸ��������ھ�����ʧ
		System.out.println(d1);
		
		double d2 = 3.99;
		int i2 = (int)d2;
		System.out.println(i2);		
		
		byte a = 37;		//�Ϸ�
		byte b = 112;		//�Ϸ�
		//byte c = 200;		//�Ƿ�������������Χ
		//byte d = a + b;	//�Ƿ������ܴ��ھ�����ʧ
		int  e = a + b;		//�Ϸ�
		System.out.println(e);
		int k = 12;			
		//byte b1 = k;		//�Ƿ������ܴ��ھ�����ʧ				
	}		
}