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
					System.out.println(i + "���������������˳�");	
					break outer;
				}	
			}
			System.out.println(i + "���������������");	
		}		
	}
}
