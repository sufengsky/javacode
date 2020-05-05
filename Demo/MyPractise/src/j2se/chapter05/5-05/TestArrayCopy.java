public class TestArrayCopy{
	public static void main(String args[]){
		TestArrayCopy tac = new TestArrayCopy();		
		int source[] = {1, 2, 3, 4, 5};
		int dest[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		tac.show(source);		
		tac.show(dest);
		System.arraycopy(source, 0, dest, 0, source.length);	
		tac.show(dest);
	}
	public void show(int[] array){	
		for(int a : array){
			System.out.print(a + "\t");	
		}
		System.out.println();
	}
}