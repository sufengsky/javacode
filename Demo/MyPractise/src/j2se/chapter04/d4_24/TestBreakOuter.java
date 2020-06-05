package j2se.chapter04.d4_24;

import java.util.Scanner;
public class TestBreakOuter{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int i;
		outer:
		while(true){
			i = scan.nextInt();
			for(int j=2; j<i; j++){
				if(i%j == 0){
					System.out.println(i + "不是素数，程序退出");	
					break outer;
				}	
			}
			System.out.println(i + "是素数，请继续！");	
		}		
	}
}
