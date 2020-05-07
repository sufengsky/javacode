import java.sql.*;

public class TestDML{
    public static void main(String args[]){
		try{		   
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    String url = "jdbc:oracle:thin:@127.0.0.1:1521:ora9";
		    Connection conn = DriverManager.getConnection(url,"scott","tiger");
		    Statement stmt = conn.createStatement();
		    stmt.executeUpdate("insert into student values('J001','����',18)");
		    stmt.executeUpdate("insert into student values('J002','����',20)");
		    stmt.executeUpdate("insert into student values('J003','����',19)");
		    ResultSet rs = stmt.executeQuery("select * from student");
		    while(rs.next()){
				System.out.print("ѧ��: " + rs.getString(1));
				System.out.print("\t����: " + rs.getString(2));
				System.out.println("\t����: " + rs.getInt(3));						    
			}
			rs.close();
			stmt.executeUpdate("update student set age=age+10");
			stmt.executeUpdate("delete from student where sid='J002'");
			System.out.println("--------------����/ɾ�����ݺ�---------------");
			rs = stmt.executeQuery("select * from student");
		    while(rs.next()){
				System.out.print("ѧ��: " + rs.getString("sid"));
				System.out.print("\t����: " + rs.getString("name"));
				System.out.println("\t����: " + rs.getInt("age"));						    
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e){
		    e.printStackTrace();
		}
    }
}
