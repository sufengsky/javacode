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
		System.out.printf("���:%s,%3d��,����%-7.2f\n","����",38,15000.00);		
		System.out.printf("���:%1$s,%2$3d��,%2$#x��\n","����",38);		
		System.out.printf("%3d,%#<x",38);
	}	
}