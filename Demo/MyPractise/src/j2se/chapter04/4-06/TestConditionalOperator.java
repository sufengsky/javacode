import java.util.Scanner;

public class TestConditionalOperator{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ٷ��Ƴɼ���");	
		int score = scanner.nextInt();
		String result = (score >= 60) ?	"����" : "������";
		System.out.println(result);	
	}	
}
