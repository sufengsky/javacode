public class TestIncrement{
	public static void main(String args[]){
		int i = 5,j;
		j = ++i;	  //�ȼ���	j = i + 1;	j = i;	
		System.out.println("i=" + i + "\tj=" + j);
		j = i++;	  //�ȼ���	j = i;		j = i + 1;		
		System.out.println("i=" + i + "\tj=" + j);
		j = 4 * i--;  //�ȼ���	j = 4 * i;	i = i - 1;
		System.out.println("i=" + i + "\tj=" + j);
	}	
}
