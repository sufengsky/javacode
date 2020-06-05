package j2se.chapter17.d17_01;

import java.net.InetAddress;

public class TestInetAddress {
	public static void main( String args[]) {
		try{
			InetAddress ia = InetAddress.getLocalHost();
			showInfo(ia);
			
			ia = InetAddress.getByName("www.sina.com.cn");
			showInfo(ia);
		}catch(java.net.UnknownHostException e){
			e.printStackTrace();
		}
		
	}
	
	public static void showInfo(InetAddress ia){
		String name = ia.getHostName();
		String address = ia.getHostAddress();
		System.out.println(name);
		System.out.println(address);
		System.out.println("----------------");
	}
}