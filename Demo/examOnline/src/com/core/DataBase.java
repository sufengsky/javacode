package com.core;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;

public class DataBase {

    private static String dbClassName = "";
	private static String dbUrl = "";

	public static void main(String args[]) {
		System.out.print(getRow("user"));
	}

	static {
		try {
			String propFileName = "/connDB.properties";
			InputStream in = DataBase.class.getResourceAsStream(propFileName);
			Properties prop=new Properties();
			prop.load(in);
			dbClassName = prop.getProperty("dbClassName");
			dbUrl = prop.getProperty("dbUrl");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(dbClassName).newInstance();
			conn = DriverManager.getConnection(dbUrl);
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		if (conn == null) {
			System.err.println("警告: DbConnectionManager.getConnection() 获得数据库链接失败.\r\n\r\n链接类型:" + dbClassName + "\r\n链接位置:" + dbUrl);
		}
		return conn;
	}

	public static int getRow(String sql) {
		int i = 0;
		Connection conn = DataBase.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement("select count(*) from " + sql);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (rs.next()) {
				i = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			i = 0;
		} finally {
			System.out.println("select count(*) from " + sql);
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return i;

	}

	public static boolean Delete(String sql) {
		boolean b = false;
		Connection con = null;
		PreparedStatement ps = null;
		con = getConnection();
		try {
			ps = con.prepareStatement(sql);
			if (ps.executeUpdate(sql) > 0) {
				b = true;
			} else {
				b = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			b = false;
		} finally {
			System.out.println(ps+"DataBase.Delete()+sql");
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				b = false;
			}

		}
		return b;
	}
}