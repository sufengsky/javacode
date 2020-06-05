package j2se.chapter18.d18_14;

import java.sql.*;
public class PrepStmt{
	public static void main(String[] args){
		Connection con = null;
		PreparedStatement pst = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:ora9";		
			con = DriverManager.getConnection(url,"scott","tiger");
			String sql = "insert into mytable2 values(?,?,?)";		
			pst = con.prepareStatement(sql);			
			for(int i = 101;i<200;i++){
				pst.setInt(1,i);
				pst.setString(2,"Tom" + i); 
				pst.setDouble(3,(100+i)*10);								
				pst.executeUpdate();
			}

			System.out.println("id:\tname:\tsalary:");	
			pst = con.prepareStatement("select * from mytable2 where id = ?");
			pst.setInt(1,157);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2).trim() + "\t" + rs.getDouble(3));	
			}
			int[] ids = {160,171,182};
			for(int i:ids){
				pst.setInt(1,i);
				rs = pst.executeQuery();
				if(rs.next()){
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2).trim() + "\t" + rs.getDouble(3));	
				}
			}
		}catch(Exception e){
			System.err.println(e);
		}finally{
			try{
				if(pst != null){
					pst.close();	
				}	
			}catch(Exception e){
		    	e.printStackTrace();
			}
			
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
