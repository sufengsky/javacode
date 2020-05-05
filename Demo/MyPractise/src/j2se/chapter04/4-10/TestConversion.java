public class TestConversion{
	public static void main(String args[]){
		int i1 = 1234567891;
		float f = i1;    //合法，但仍然可能存在精度损失
		System.out.println(f);
		double d1 = i1;	//合法，不存在精度损失
		System.out.println(d1);
		
		double d2 = 3.99;
		int i2 = (int)d2;
		System.out.println(i2);		
		
		byte a = 37;		//合法
		byte b = 112;		//合法
		//byte c = 200;		//非法，超出表数范围
		//byte d = a + b;	//非法，可能存在精度损失
		int  e = a + b;		//合法
		System.out.println(e);
		int k = 12;			
		//byte b1 = k;		//非法，可能存在精度损失				
	}		
}