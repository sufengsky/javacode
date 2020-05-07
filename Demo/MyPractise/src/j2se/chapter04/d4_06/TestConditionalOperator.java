import java.util.Scanner;

public class TestConditionalOperator{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入百分制成绩：");	
		int score = scanner.nextInt();
		String result = (score >= 60) ?	"及格" : "不及格";
		System.out.println(result);	
	}	
}
