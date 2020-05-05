import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample{
    public static void main(String args[]){
		try{		    
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    String url = "jdbc:oracle:thin:@127.0.0.1:1521:ora9";
		    Connection conn = DriverManager.getConnection(url,"scott","tiger");
		    Statement stmt = conn.createStatement();
		    ResultSet rs = stmt.executeQuery("select * from dept");
		    while(rs.next()){
				System.out.print("DeptNo: " + rs.getInt(1));
				System.out.print("\tDeptName: " + rs.getString(2));
				System.out.println("\tLOC: " + rs.getString(3));						    
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(ClassNotFoundException e){
		    System.out.println("找不到指定的驱动程序类!");
		}catch(SQLException e){
		    e.printStackTrace();
		}
    }
}
