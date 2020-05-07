public class TestArrayCopy2{
	public static void main(String args[]){
		TestArrayCopy2 tac = new TestArrayCopy2();		
		int[][] source = {{1, 2},{3, 4, 5}};
		int[][] dest   = {{9, 8, 7}, {6, 5, 4, 3}, {2, 1}};
		tac.show(source);		
		tac.show(dest);
		System.arraycopy(source, 0, dest, 0, source.length);	
		tac.show(dest);
		
		source[1][1] = 99;
		System.out.println(dest[1][1]);
	}
	public void show(int[][] array2){	
		for(int[] a1 : array2){
			for(int a : a1){
				System.out.print(a + "\t");	
			}
			System.out.println();
		}
		System.out.println("-------------------------");		
	}
}
