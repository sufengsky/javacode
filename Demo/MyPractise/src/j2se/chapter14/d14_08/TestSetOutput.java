import java.io.*;
import java.util.Date;

public class TestSetOutput{
	public static void main(String[] args){
		PrintStream ps = null;
		PrintStream ps_error = null;
		try{
			ps = new PrintStream(new FileOutputStream("output.txt",true));
			System.setOut(ps);
			ps_error = new PrintStream(new FileOutputStream("errorLog.txt",true));
			System.setErr(ps_error);

			int avg = 0;
			int total = 0;
			int count = 0;
			int num = 0;
			int i;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			while(s != null && !s.equals("over")){
				i = Integer.parseInt(s);
				num++;
				total += i;
				avg = total/num;
				System.out.println("num=" + num + "\ttotal=" + total + "\tavg=" + avg);	
				s = br.readLine();
			}
		}catch(Exception e){
			System.err.println("出错时间: " + new Date());
			System.err.print("错误信息:");
			e.printStackTrace(System.err);	
		}finally{
			try{
				ps.close();
				ps_error.close();
			}catch(Exception e1){
				System.err.println("出错时间: " + new Date());
				System.err.print("错误信息:");
				e1.printStackTrace(System.err);	
			}	
		}
	}
}