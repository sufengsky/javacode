package j2se.chapter17.d17_02;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;
public class URLReader{
	public static void main(String args[]){
		//System.setProperty("http.proxyHost","192.168.1.1");
		//System.setProperty("http.proxyPort","11080");
		try{
			URL tirc = new URL("http://www.google.cn/");
			BufferedReader in = new BufferedReader(new 
				InputStreamReader(tirc.openStream()));
			String s;
			while((s = in.readLine())!=null)
				System.out.println(s);
			in.close();	
		}catch(MalformedURLException e) {
			System.out.println(e);	
		}catch(IOException e){
			System.out.println(e);
		}	
    }
}
