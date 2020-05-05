import java.sql.*;
import java.io.*;

public class SavePicture{
	public static void main(String[] args){	
		Connection conn = null;	
	    PreparedStatement stmt = null;
	    FileInputStream fis = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:ora9";
			conn = DriverManager.getConnection(url, "scott","tiger");
			String sql = "insert into Student_List values(?,?,?)";
			stmt=conn.prepareStatement(sql);
			stmt.setString(1,"s01");
			stmt.setString(2,"Youyou");
			File file = new File("yy.jpg");
           	fis = new FileInputStream(file);
           	stmt.setBinaryStream(3, fis, (int)file.length());
			stmt.executeUpdate();
			stmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		    try{
		        if(fis!=null){
		        	fis.close();
		        }
		    }catch(IOException ioe){
		        ioe.printStackTrace();
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
