import java.util.StringTokenizer;
public class TestStringTokenizer{
	public static void main(String args[]){
		String s;
		StringTokenizer st = new StringTokenizer("���� ɳ̲ ����");
		while (st.hasMoreTokens()) {
			s = st.nextToken();
			System.out.println(s);
     	}
		System.out.println("------------------");

		st = new StringTokenizer("����:ɳ̲:����",":");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
     	}     	
		System.out.println("------------------");
		
		st = new StringTokenizer("����:ɳ̲:����",":",true);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
     	}     	
	}
}