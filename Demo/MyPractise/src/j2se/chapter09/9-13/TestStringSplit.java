public class TestStringSplit{
	public static void main(String args[]){
		String s = "����:ɳ̲:����:������";
		String[] results = s.split(":");
		for(String each: results) {
			System.out.println(each);
     	}     	
	}
}