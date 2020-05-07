import java.sql.*;
public class TestUpdatableResultSet{
    public static void main(String args[]){
		Connection conn = null;
		try{
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    String url = "jdbc:oracle:thin:@localhost:1521:ora9";
		    conn = DriverManager.getConnection(url,"scott","tiger");
		    Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select tid,name,salary from teacher");
			//ResultSet rs = stmt.executeQuery("select teacher.* from teacher");
			
			//����ǰ�����������
			while(rs.next()){
				showOneRow(rs);		
			}
			
			//���º�ɾ����¼
			rs.beforeFirst();
			while(rs.next()){
				String name = rs.getString("name").trim();
				if(name.equals("����")){
					double sal = rs.getDouble("salary");
					rs.updateDouble("salary", sal + 8888);
					rs.updateRow();	
				}else if(name.equals("����")){
					rs.deleteRow();	
				}	
			}
			//�����¼�¼
			rs.moveToInsertRow();
			rs.updateInt("tid",1005);
			rs.updateString("name","�Ʒ���");
			rs.updateDouble("salary",2840);
			rs.insertRow();
			rs.close();
			
			//��������º�����ݿ�������
			System.out.println("--------------------------------------------");
			rs = stmt.executeQuery("select * from teacher");
			while(rs.next()){
				showOneRow(rs);		
			}
			rs.close();
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
    	System.out.print("��" + rs.getRow() + "��: ");
		System.out.print(rs.getInt(1));
		System.out.print("\t" + rs.getString(2));
		System.out.print("\t" + rs.getDouble(3));
		System.out.println();
    }
}
