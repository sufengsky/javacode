import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile{
	public static void main (String[] args) {
		String fname = "test.txt";
		File f = new File(fname);
		try {
			FileReader fr = new FileReader(f); 
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			while ( s != null ) {
				System.out.println("读入: " + s);
				s = br.readLine();
			}			
			br.close();
		} catch (FileNotFoundException e1) {
			System.err.println("File not found: " + fname);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
}
