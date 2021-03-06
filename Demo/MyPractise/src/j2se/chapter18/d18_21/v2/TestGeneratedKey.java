package j2se.chapter18.d18_21.v2;

import java.sql.*;
import java.util.*;

public class TestGeneratedKey{
    public static void main(String args[]){
		Connection conn = null;	
	    Statement stmt = null;
	    ResultSet rs = null;
		try{		    
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    String url = "jdbc:oracle:thin:@127.0.0.1:1521:ora9";
		    conn = DriverManager.getConnection(url,"scott","tiger");
		    stmt=conn.createStatement();
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("信息录入");
		    String name;
		    String sex;
		    int age;	
		    String sql;
	    	int id = 0;
		    while(true){
		    	try{
			    	System.out.print("姓名:");	
			    	name = scanner.next();
			    	System.out.print("性别（男/女）:");
			    	sex = scanner.next();
			    	System.out.print("年龄:");
			    	age = scanner.nextInt();
			    	if(name.equals("") || sex.equals("") || (age<0) || (age>130)){
			    		throw new NumberFormatException("数据格式不合理!");	
			    	}else if(name.equals("exit")){
			    		break;
			    	}
		    		sql = "insert into records values(seq_id.nextval,'" 
		    			+ name + "','" + sex + "'," + age + ")";
		    		stmt.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);	
		    		rs = stmt.getGeneratedKeys();
		    		if(rs.next()){
		    			id = rs.getInt(1);	
		    		}
		    		System.out.println("您的信息已存档,病历号码:" + id);
		    	}catch(NumberFormatException nfe){
		    		System.out.println("数据格式不合理!请重新输入！");
		    	}
		    		
		    }
		    /*
		    ResultSet rs = stmt.executeQuery("select * from dept");
		    while(rs.next()){
				System.out.print("DeptNo: " + rs.getInt(1));
				System.out.print("\tDeptName: " + rs.getString(2));
				System.out.println("\tLOC: " + rs.getString(3));						    
			}
			*/
			rs.close();
			stmt.close();
			conn.close();
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
