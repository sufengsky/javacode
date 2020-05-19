import java.util.StringTokenizer;
public class TestStringTokenizer{
	public static void main(String args[]){
		String s;
		StringTokenizer st = new StringTokenizer("阳光 沙滩 海浪");
		while (st.hasMoreTokens()) {
			s = st.nextToken();
			System.out.println(s);
     	}
		System.out.println("------------------");

		st = new StringTokenizer("阳光:沙滩:海浪",":");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
     	}     	
		System.out.println("------------------");
		
		st = new StringTokenizer("阳光:沙滩:海浪",":",true);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
     	}     	
	}
}