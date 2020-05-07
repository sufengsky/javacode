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
	 		//将time和info信息写入数据库---	
	 		System.out.println("出错时间: " + time);
	 		System.out.println("错误信息:\n" + info);
		}			
	}	
}