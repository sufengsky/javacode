public class TestStringSplit{
	public static void main(String args[]){
		String s = "—Ùπ‚:…≥Ã≤:∫£¿À:œ…»À’∆";
		String[] results = s.split(":");
		for(String each: results) {
			System.out.println(each);
     	}     	
	}
}