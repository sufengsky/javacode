import java.sql.*;
import java.io.*;

public class GetPicture{
	public static void main(String[] args){
	    PreparedStatement stmt = null;
	    ResultSet rs =  null;
		Connection conn = null;
	    FileOutputStream fos = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url=   "jdbc:oracle:thin:@localhost:1521:ora9";
			conn = DriverManager.getConnection(url,"scott","tiger");
			String sql="select * from Student_List where Student_ID='s01'";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
            rs.next();
			File file = new File("d:\\kk.jpg");
            fos = new FileOutputStream(file);  
            InputStream is = rs.getBinaryStream(3);
            int len = 0;
            byte b[] = new byte[4*1024];
            while((len=is.read(b))!=-1)
            {
                fos.write(b,0,len);
            }
            fos.flush();
			fos.close();
            is.close();
            rs.close();
			stmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		    try{
		        if(fos!=null){
		        	fos.close();
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
