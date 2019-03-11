<%@ page import="java.sql.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
	<head>
		<title>SQl</title>
	</head>
	<body>
		<%
			try {
				// 初始化数据库驱动类
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				System.out.println("成功加载SQL驱动程序");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			String DB_Url = "jdbc:sqlserver://127.0.0.1;DataName=study";
			String user = "sa";
			String password = "sufeng";
			Statement statement;
			Connection connection = null;
			try {
				// 获取数据库连接
				connection = DriverManager.getConnection(DB_Url, user, password);
				// 在数据库连接上创建一条语句
				statement = connection.createStatement();
				// 执行sql语句
				statement.executeQuery("select * from study..shop"); //这里的表名称要加上数据库的名称

				ResultSet resultSet = statement.getResultSet();
				while (resultSet.next()) {
					String username = resultSet.getString("ShopName");
					String userpassword = resultSet.getString("ShopAdrress");

					out.println(username + "\t" + userpassword + "\t<br>");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		%>
	</body>
</html>