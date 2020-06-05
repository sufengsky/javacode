package j2se.chapter09.d9_10;

public class TestStringConstructor{
	public static void main(String args[]){
		String s = new String();
		System.out.println(s.length());
		System.out.println(s);
		
		byte[] b = {97,98,99,100,101,102,103};
		System.out.println(new String(b));
		System.out.println(new String(b,3,2));
		try{
			System.out.println(new String(b,"GBK"));
		}catch(java.io.UnsupportedEncodingException uee){
			uee.printStackTrace();	
		}
		
		char[] c = {'h','i','j','k','l','m','n'};
		System.out.println(new String(c));
		System.out.println(new String(c,2,4));
		
		System.out.println(new String("Hello,World!"));	
		System.out.println(new StringBuffer("abc"));
	}
}