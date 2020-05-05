import java.io.*;
import java.util.Scanner;

public class ReadFile3{
	public static void main (String[] args) {		
		Scanner scan = new Scanner(System.in);
		String name;
		do{
			System.out.print("��ָ��Ҫ��ȡ���ļ�:");
			name = scan.next();	
			readOneFile(name);
			System.out.print("������ȡ�����ļ���(y/Y):");
			boolean next = scan.next().equalsIgnoreCase("y");
			if(!next)
				break;				
		}while(true);
	}
	
	public static void readOneFile(String fname){
		try {
			FileReader fr = new FileReader(fname); 
			BufferedReader br = new BufferedReader(fr);
			String s;
			while ( (s = br.readLine()) != null ) {
				System.out.println("����: " + s);
			}			
			br.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
