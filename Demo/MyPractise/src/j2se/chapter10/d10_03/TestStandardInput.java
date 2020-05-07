import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TestStandardInput{
	public static void main (String args[]) {
		String s;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			s = br.readLine();
			while (!s.equals("")) {  	
				System.out.println("Read: " + s);
				s = br.readLine();
			}
			br.close(); 
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}
}
