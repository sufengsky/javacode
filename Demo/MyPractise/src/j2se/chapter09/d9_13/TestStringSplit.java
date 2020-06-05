package j2se.chapter09.d9_13;

public class TestStringSplit{
	public static void main(String args[]){
		String s = "阳光:沙滩:海浪:仙人掌";
		String[] results = s.split(":");
		for(String each: results) {
			System.out.println(each);
     	}     	
	}
}