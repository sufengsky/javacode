import static p1.p2.MyTool.*;
//import static p1.p2.MyTool.PI;
//import static p1.p2.MyTool.getArea;

public class Test {
	public static void main(String[] args) {
		double r = 10;
		double s = 2*PI*10;
		System.out.println("半径为" + r + "的圆的面积为:"+ s);
		System.out.println(getArea(30,40));
	}
}