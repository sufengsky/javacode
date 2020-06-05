package j2se.chapter15.d15_08;

public class Test{
	public static void main(String[] args){
		Point<Integer> pi = new Point<Integer>(20,40);
		pi.setX(pi.getX() + 100);
		pi.showInfo();
		
		Point<Double> pd = new Point<Double>();
		pd.setX(3.45);
		pd.setY(6.78);
		pd.showInfo();
				
		Point<String> ps = new Point<String>();		
	}
}
