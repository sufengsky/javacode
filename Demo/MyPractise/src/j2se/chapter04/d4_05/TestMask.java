public class TestMask{
	
	/*��ȡָ������num�����Ʊ�ʾ���Ҳ�����nλ��ֵ
	 *n��1��ʼ����32����
	 */
	public int getOneBit(int num,int n){
		int i = 1 << (n-1);	
		int nb = num & i;
		return nb >> (n-1);	
	}
	
	public static void main(String args[]){
		int x = 6;
		TestMask tm = new TestMask();
		System.out.print(tm.getOneBit(x,4));		
		System.out.print(tm.getOneBit(x,3));		
		System.out.print(tm.getOneBit(x,2));		
		System.out.print(tm.getOneBit(x,1));		
	}	
}
