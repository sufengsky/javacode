import java.util.Scanner;
public class TestThrowException{
	public static void main(String[] args){
		TestThrowException t = new TestThrowException();
		System.out.print("请输入您的年龄：");
		System.out.println("您的年龄：" + t.inputAge());
	}
	
	public int inputAge(){
		int result = -1;
		Scanner scan = new Scanner(System.in);
		while(true){
			try{
				result = scan.nextInt();
				if(result<0 || result>130){
					Exception me = new Exception("年龄超出合理范围！");
					throw me;	
				}
				break;					
			}catch(Exception e1){
				System.out.print(e1.getMessage() + "请重新输入：");
				continue;
			}	
		}
		return result;	
	}
}
