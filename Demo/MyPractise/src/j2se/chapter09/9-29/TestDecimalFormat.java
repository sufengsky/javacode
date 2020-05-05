import java.text.DecimalFormat;

public class TestDecimalFormat{
	public static void main(String args[]){
		double d = 12345.67;
		DecimalFormat df1 = new DecimalFormat();
		DecimalFormat df2 = new DecimalFormat("###,###.0000");
		DecimalFormat df3 = new DecimalFormat("000,000.####");
		System.out.println(df1.format(d));
		System.out.println(df2.format(d));
		System.out.println(df3.format(d));
		
		df3.applyPattern("0.0000E00");
		System.out.println(df3.format(d));
		df3.applyPattern("\u00A4###,###.00%");
		System.out.println(df3.format(d));
		df3.applyPattern("00.00%");
		System.out.println(df3.format(0.34819));

		try{		
			double d1 = df1.parse("35.2974").doubleValue();		
			double d2 = df2.parse("1,4135.2974").doubleValue();		
			double d3 = df3.parse("92.37%").doubleValue();		
			System.out.println(d1);
			System.out.println(d2);
			System.out.println(d3);
		}catch(java.text.ParseException e){
			e.printStackTrace();	
		}
	}	
}