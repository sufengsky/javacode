package j2se.chapter04.d4_07;

public class TestIncrement{
	public static void main(String args[]){
		int i = 5,j;
		j = ++i;	  //等价于	j = i + 1;	j = i;	
		System.out.println("i=" + i + "\tj=" + j);
		j = i++;	  //等价于	j = i;		j = i + 1;		
		System.out.println("i=" + i + "\tj=" + j);
		j = 4 * i--;  //等价于	j = 4 * i;	i = i - 1;
		System.out.println("i=" + i + "\tj=" + j);
	}	
}
