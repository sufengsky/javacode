import java.util.Scanner;

public class TestInput{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("�������������:");
		String name = s.nextLine();
		
		System.out.println("����������:");
		int age = s.nextInt();
		
		System.out.println("��������Ĺ�������:");
		double salary = s.nextDouble();
			
		System.out.println("���ĸ�����Ϣ:\n����" 
			+ name + "\t����" + age + "��\t����" + salary + "Ԫ");
	}	
}