package j2se.chapter17.d17_02.v2;

import java.util.Scanner;
import java.net.URL;
import java.io.IOException;
import java.net.MalformedURLException;
public class URLReader{
	public static void main(String args[]){
		try{
			URL tirc = new URL("http://www.google.cn/");
			Scanner scan = new Scanner(tirc.openStream());
			while(scan.hasNext()){
				System.out.println(scan.next());
			}
		}catch(IOException e){
			System.out.println(e);
		}	
    }
}
