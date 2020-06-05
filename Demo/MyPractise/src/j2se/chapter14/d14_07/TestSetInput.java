package j2se.chapter14.d14_07;

import java.io.*;

public class TestSetInput{
	public static void main(String[] args){
		try{
			//FileInputStream fis = new FileInputStream("source.txt");
			//System.setIn(fis);			
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
			e.printStackTrace();	
		}
	}
}