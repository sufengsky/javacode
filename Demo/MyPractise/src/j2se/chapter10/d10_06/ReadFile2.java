import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile2{
	public static void main (String[] args) {
		if(args.length != 1){
			System.out.println("ȱ�ٲ������������÷�:");	
			System.out.println("    java ReadFile <[·��]�ļ���>");	
			System.out.println("�����˳�!");	
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
				System.out.println("����: " + s);
			}			
			br.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
