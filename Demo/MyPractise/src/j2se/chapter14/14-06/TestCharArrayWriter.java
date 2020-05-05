import java.io.*;
import java.util.Date;

public class TestCharArrayWriter{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new FileReader("a.txt"));
			String s ;
			while((s=br.readLine()) != null){
				System.out.println(s);	
			}
		}catch(IOException e){
			CharArrayWriter cw = new CharArrayWriter(); 
			PrintWriter pw = new PrintWriter(cw,true); 
	 		e.printStackTrace(pw);
	 		//char[] ca = cw.toCharArray(); 
	 		String info = cw.toString(); 
	 		Date time = new Date();
	 		//��time��info��Ϣд�����ݿ�---	
	 		System.out.println("����ʱ��: " + time);
	 		System.out.println("������Ϣ:\n" + info);
		}			
	}	
}