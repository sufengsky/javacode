package j2se.chapter10.d10_02;

import java.util.Properties;
import java.util.Enumeration;
public class TestSystemProperties {
	public static void main(String[] args) {
		Properties ps = System.getProperties();
		ps.setProperty("*****myName*****","*****myValue*****");		
		Enumeration pn = ps.propertyNames();
		while ( pn.hasMoreElements() ) {
			String pName = (String) pn.nextElement();
			String pValue = ps.getProperty(pName);
			System.out.println(pName + "----" + pValue);
		}
	}
}

//	java  TestSystemProperties
//	java -DmyPropertyName=MyValue TestSystemProperties
