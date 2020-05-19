public class TestLength{
	public static void main(String args[]){
		String[] friends = new String[3];
		friends[0] = "Tom";
		friends[1] = "Billy";
		friends[2] = "Kity";
		//friends[3] = "Nancy";		//非法，数组下标越界
		new TestLength().show(friends);
	}
	
	public void show(String s[]){
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);	
		}	
	}
	
	public void show1(String s[]){
		for(String k:s){
			System.out.println(k);	
		}	
	}
}