import java.util.Random;
public class TestRandom2{
	public static void main(String args[]){
		Random rand1 = new Random(10);
		Random rand2 = new Random(10);
		TestRandom2.display(rand1);
		TestRandom2.display(rand2);
		
		for(int i=0;i<5;i++){
			Random rand = new Random(10);
			System.out.println(rand.nextInt());
		}
	}	
	public static void display(Random rand){	
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(10));
		System.out.println(rand.nextBoolean());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextFloat());
		System.out.println("--------------");
	}	
}