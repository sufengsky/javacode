package j2se.chapter18.d18_07;

import java.sql.*;

public class TestAccess{
	public static void main(String[] args) {
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
			Connection con = DriverManager.getConnection("jdbc:odbc:test", "", ""); 
			Statement stmt = con.createStatement();
			ResultSet rs   = stmt.executeQuery("select * from table1");			    
			while(rs.next()){
					System.out.print("编号:" + rs.getString(1));
					System.out.print("\t姓名:" + rs.getString(2));
					System.out.print("\t性别:" + rs.getString(3));
					System.out.println();
			}
			rs.close();
			stmt.close();
			con.close();		    
		}catch(Exception e){
		    e.printStackTrace();
		}
	}
}