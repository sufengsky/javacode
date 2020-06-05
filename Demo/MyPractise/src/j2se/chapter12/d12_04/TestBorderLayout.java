package j2se.chapter12.d12_04;

import java.awt.Frame;
import java.awt.Button;
public class TestBorderLayout {
	public static void main(String args[]) {
		Frame f = new Frame("Border Layout");
		Button bn = new Button("BN");
		Button bs = new Button("BS");
		Button bw = new Button("BW");
		Button be = new Button("BE");
		Button bc = new Button("BC");
		f.add(bn, "North");
		f.add(bs, "South");
		f.add(bw, "West");
		f.add(be, "East");
		f.add(bc, "Center");
		f.setSize(200,200);
		f.setVisible(true);
	}
}
