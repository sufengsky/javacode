import java.sql.*;
public class CallStmt{
	public static void main(String[] args){
		Connection con = null;
		CallableStatement cst = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:ora9";		
			con = DriverManager.getConnection(url,"scott","tiger");
			cst = con.prepareCall("{call MyProcedure(?,?,?)}");			
			cst.setInt(1,1001);
			cst.setString(2,"Jenny");
			cst.setInt(3,48);
			cst.execute();
			cst.close();
		}catch(Exception e){
			System.err.println(e);
		}finally{
			try{
				if(con != null){
					con.close();	
				}	
			}catch(Exception e){
		    	e.printStackTrace();
			}
		}
	}
}
