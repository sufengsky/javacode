public class TestCommaExp{
	public static void main(String args[]){
		int i, j;
		for(i = 0, j = 10; i <= j; i++, j = j - 1){
			System.out.println("i=" + i + ",\tj=" + j);	
		}
	}
}