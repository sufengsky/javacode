import java.sql.*;
public class TestMetaData{
    public static void main(String args[]){
		Connection conn = null;
		try{
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    String url = "jdbc:oracle:thin:@localhost:1521:ora9";
		    conn = DriverManager.getConnection(url,"scott","tiger");
		    ResultSet rs = null;		
			DatabaseMetaData dmd = conn.getMetaData(); 
			if (dmd == null) { 
				System.out.println ("No Meta available"); 
			} else { 
				System.out.println ("数据库名称:" + dmd.getDatabaseProductName()); 
				System.out.println ("数据库版本:" + dmd.getDatabaseProductVersion()); 
				System.out.println ("数据库驱动程序：" + dmd.getDriverName()); 
				System.out.println ("驱动程序版本号：" + dmd.getDriverVersion()); 
				System.out.println ("并发访问的用户个数" + dmd.getMaxConnections()); 
				System.out.println ("数据类型列表：" ); 
				rs = dmd.getTypeInfo();
				while(rs.next()){
					System.out.println("\t" + rs.getString(1));	
				}
				rs.close();
			} 					    
		    Statement stmt = conn.createStatement();
		    String s = "select * from dept";
		    rs = stmt.executeQuery(s);						
		    System.out.println("数据表dept结构信息：");
		    ResultSetMetaData  rsm = rs.getMetaData();
		    int columnCount = rsm.getColumnCount();
			System.out.println("列序号\t列名\t数据类型");
		    for(int i=1;i<=columnCount;i++){
				System.out.println(" " + i + " \t" + 
				rsm.getColumnName(i) + "\t" + 
				rsm.getColumnTypeName(i));			    
		    }
		    rs.close();
		    stmt.close();
		}catch(Exception e){
		    e.printStackTrace();
		}finally{
			try{
				if(conn != null && !conn.isClosed()){
					conn.close();	
				}	
			}catch(Exception e){
		    	e.printStackTrace();
			}
		}
    }
}
