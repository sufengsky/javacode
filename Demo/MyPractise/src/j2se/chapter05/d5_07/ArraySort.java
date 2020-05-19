import java.util.Arrays;
public class ArraySort{
	public static void main(String args[]){
		ArraySort as = new ArraySort();		
		
		int[] a = {6,23,45,12,-83,94,41};
		as.showIntArr(a);
		Arrays.sort(a);
		as.showIntArr(a);
		System.out.println();
		String[] s = {"Lisa","祝英台","Billy","Kacy","梁山伯"};
		as.showStringArr(s);
		Arrays.sort(s);
		as.showStringArr(s);
	}
	
	public void showIntArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + "\t");	
		}
		System.out.println();	
	}
	
	public void showStringArr(String[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + "\t");	
		}
		System.out.println();	
	}
}
