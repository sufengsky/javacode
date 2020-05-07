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
				System.out.println ("�������ʵ��û�����" + dmd.getMaxConnections()); 
				System.out.println ("���������б�" ); 
				rs = dmd.getTypeInfo();
				while(rs.next()){
					System.out.println("\t" + rs.getString(1));	
				}
				rs.close();
			} 					    
		    Statement stmt = conn.createStatement();
		    String s = "select * from dept";
		    rs = stmt.executeQuery(s);						
		    System.out.println("���ݱ�dept�ṹ��Ϣ��");
		    ResultSetMetaData  rsm = rs.getMetaData();
		    int columnCount = rsm.getColumnCount();
			System.out.println("�����\t����\t��������");
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
