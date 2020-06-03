package j2se.chapter03.d3_14;

public class TestPrintf{
	public static void main(String args[]){
		System.out.printf("%+8.3f",3.14);	
		System.out.println();			
		System.out.printf("%+-8.3f\n",3.14);
		System.out.printf("%08.3f\n",3.14);
		System.out.printf("%(8.3f\n",-3.14);
		System.out.printf("%,f\n",2356.34);
		System.out.printf("%x\n",0x4a3b);
		System.out.printf("%#x\n",0x4a3b);		
		System.out.println("------------");	
		System.out.printf("你好:%s,%3d岁,工资%-7.2f\n","张三",38,15000.00);		
		System.out.printf("你好:%1$s,%2$3d岁,%2$#x岁\n","张三",38);		
		System.out.printf("%3d,%#<x",38);
	}	
}