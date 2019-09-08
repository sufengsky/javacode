package Demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public Connection getDbConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Nintendo14");
        return con;
    }
}


