import java.sql.*;

public class TestSQLServer2{
	public static void main(String[] args) {
		try{
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");  
			Connection con = DriverManager.getConnection 
			  ("jdbc:microsoft:sqlserver://127.0.0.1:1433;databasename=pubs","tom","cat"); 			 
			Statement stmt = con.createStatement();
			ResultSet rs   = stmt.executeQuery("select * from mytable1");
			    
			while(rs.next()){
					System.out.print("sid：" + rs.getInt(1));
					System.out.print("\tname：" + rs.getString(2).trim());
					System.out.print("\tsex：" + rs.getString(3).trim());
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