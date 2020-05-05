import java.sql.*;

public class TestDDL{
    public static void main(String args[]){
    	Connection conn = null;
    	Statement stmt = null;
    	ResultSet rs = null;
		try{		   
			System.setProperty("jdbc.drivers","oracle.jdbc.driver.OracleDriver");
		    String url = "jdbc:oracle:thin:@127.0.0.1:1521:ora9";
		    conn = DriverManager.getConnection(url,"scott","tiger");
		    stmt = conn.createStatement();
			
			stmt.execute("create table mytable(id number, name char(10), phone char(10))");		    
		    stmt.executeUpdate("insert into mytable values(55,'Tom','67666939')");
		    rs = stmt.executeQuery("select * from mytable");
		    while(rs.next()){
		    	System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));	
		    }
		    stmt.execute("drop table mytable");
		}catch(Exception e){
		    e.printStackTrace();
		}finally{
			try{
				if(rs != null){
					rs.close();
				}
			}catch(Exception e){
		    	e.printStackTrace();
			}	
			
			try{
				if(stmt != null){
					stmt.close();
				}
			}catch(Exception e){
		    	e.printStackTrace();
			}	
			try{
				if(conn != null){
					conn.close();
				}
			}catch(Exception e){
		    	e.printStackTrace();
			}	
		}
    }
}
