import java.sql.*;
public class TestScrollResultSet{
    public static void main(String args[]){
		Connection conn = null;
		try{
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    String url = "jdbc:oracle:thin:@localhost:1521:ora9";
		    conn = DriverManager.getConnection(url,"scott","tiger");
		    Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while(rs.next()){
				showOneRow(rs);
			}
			System.out.println("-----------");
			rs.last();
			showOneRow(rs);
			rs.first();
			showOneRow(rs);
			rs.beforeFirst();
			rs.next();
			showOneRow(rs);
			rs.absolute(2);
			showOneRow(rs);
		}catch(Exception e){
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
    
    public static void showOneRow(ResultSet rs) throws SQLException{
    	System.out.print("第" + rs.getRow() + "行: ");
		System.out.print(rs.getString(1));
		System.out.print("\t" + rs.getString(2));
		System.out.print("\t" + rs.getString(3));
		System.out.println();
    }
}
