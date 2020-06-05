package j2se.chapter18.d18_18;

import java.sql.*;
public class TestBatch{
	public static void main(String[] args){
		Connection conn = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:ora9";		
			conn = DriverManager.getConnection(url,"scott","tiger");
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			stmt.addBatch("insert into teacher values(11,'Tom',2500)");
			stmt.addBatch("insert into teacher values(12,'John',3400)");
			stmt.addBatch("insert into teacher values(13,'Billy',3150)");
			stmt.addBatch("update teacher set salary = salary + 88");
			stmt.executeBatch();
			conn.commit();
			
			ResultSet rs = stmt.executeQuery("select * from teacher");
			while(rs.next()){
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2).trim() + "\t" + rs.getDouble(3));	
			}
			rs.close();
			stmt.close();
		}catch(Exception e){
			System.out.println("Failure,rollback!");
		    try{
		    	conn.rollback();   
		    }catch(Exception e1){
		    	e.printStackTrace();	
		    }		    
		    e.printStackTrace();
		}finally{
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
