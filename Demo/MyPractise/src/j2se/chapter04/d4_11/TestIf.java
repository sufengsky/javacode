import java.util.*;

public class TestIf{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input score:");
		int score = sc.nextInt();
		
		if(score < 60)
			score = 60;
		System.out.println("score:" + score);		
		
		if(score > 90){
			System.out.print("Input your name:");
			String name = sc.next();
			System.out.println("name:" + name);	
		}						
	}		
}