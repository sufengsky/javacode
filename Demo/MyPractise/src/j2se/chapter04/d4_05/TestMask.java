package j2se.chapter04.d4_05;

public class TestMask{
	
	/*获取指定整数num二进制表示从右侧数第n位的值
	 *n从1开始，到32结束
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
