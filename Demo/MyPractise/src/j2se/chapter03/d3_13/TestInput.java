import java.util.Scanner;

public class TestInput{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("请输入你的姓名:");
		String name = s.nextLine();
		
		System.out.println("请输入年龄:");
		int age = s.nextInt();
		
		System.out.println("请输入你的工资数额:");
		double salary = s.nextDouble();
			
		System.out.println("您的个人信息:\n姓名" 
			+ name + "\t年龄" + age + "岁\t工资" + salary + "元");
	}	
}