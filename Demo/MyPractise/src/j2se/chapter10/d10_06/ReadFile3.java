import java.io.*;
import java.util.Scanner;

public class ReadFile3{
	public static void main (String[] args) {		
		Scanner scan = new Scanner(System.in);
		String name;
		do{
			System.out.print("请指定要读取的文件:");
			name = scan.next();	
			readOneFile(name);
			System.out.print("继续读取其它文件吗？(y/Y):");
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
				System.out.println("读入: " + s);
			}			
			br.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
