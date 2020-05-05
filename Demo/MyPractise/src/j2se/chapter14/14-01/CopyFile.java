import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile{
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream ("a.jpg");
			FileOutputStream fos = new FileOutputStream ("temp.jpg");
			int read = fis.read();		
			while ( read != -1 ) {
				fos.write(read);	
				read = fis.read();
			}			
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
