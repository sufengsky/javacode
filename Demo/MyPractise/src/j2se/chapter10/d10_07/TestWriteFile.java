import java.io.*;

public class TestWriteFile{
	public static void main (String[] args) {
		File file = new File("tt.txt");
		try {
			InputStreamReader  is = new InputStreamReader(System.in);
			BufferedReader in=new BufferedReader(is);
			PrintWriter out  = new PrintWriter(new FileWriter(file));
			String s = in.readLine();
			while (!s.equals("")) {// 从键盘逐行读入数据输出到文件
				out.println(s);
				s = in.readLine();
			}
			in.close();   // 关闭BufferedReader输入流.		     
			out.close();  // 关闭连接文件的PrintWriter输出流.
		}catch (IOException e) {
			e.printStackTrace();  
		}
	 }
}
