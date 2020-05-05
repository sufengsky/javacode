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
				System.out.println ("���ݿ�����:" + dmd.getDatabaseProductName()); 
				System.out.println ("���ݿ�汾:" + dmd.getDatabaseProductVersion()); 
				System.out.println ("���ݿ���������" + dmd.getDriverName()); 
				System.out.println ("��������汾�ţ�" + dmd.getDriverVersion());
				System.out.println ("--------------------------------------------");

				System.out.println ("��������ͼ�֧�����(true-֧��,false-��֧��)");
				System.out.println ("TYPE_FORWARD_ONLY: " + 
					dmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)); 
				System.out.println ("TYPE_SCROLL_INSENSITIVE: " + 
					dmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)); 
				System.out.println ("TYPE_SCROLL_SENSITIVE: " + 
					dmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)); 
				System.out.println ("CONCUR_READ_ONLY: " + 
					dmd.supportsResultSetType(ResultSet.CONCUR_READ_ONLY)); 
				System.out.println ("CONCUR_UPDATABLE: " + 
					dmd.supportsResultSetType(ResultSet.CONCUR_UPDATABLE)); 
			} 					    
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
}
