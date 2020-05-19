import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile2{
	public static void main (String[] args) {
		if(args.length != 1){
			System.out.println("缺少参数，本程序用法:");	
			System.out.println("    java ReadFile <[路径]文件名>");	
			System.out.println("程序退出!");	
		}else{
			ReadFile2.readOneFile(args[0]);
		}
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
