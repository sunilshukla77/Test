package com.collections;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PropertiesDemo {
	private static Properties props = null;

	static {
		try {
			props = new Properties();
			props.load(new FileInputStream("src/main/java/com/collections/connection.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection con = null;
		String driverClass = props.getProperty("driverClassName");
		String url = props.getProperty("url");
		String username = props.getProperty("username");
		String pwd = props.getProperty("password");
		try {
			// Load & Register JDBC Driver class
			Class.forName(driverClass);

			con = DriverManager.getConnection(url, username, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) throws Exception{
		//Connection con = PropertiesDemo.getConnection();
	
		//DatabaseMetaData dbmd = con.getMetaData();
		String driverClass = props.getProperty("driverClassName");
		String url = props.getProperty("url");
		String username = props.getProperty("username");
		String pwd = props.getProperty("password");
		
		/*System.out.println("Database Name:"+dbmd.getDatabaseProductName());
		System.out.println("Database Product version:"+dbmd.getDatabaseProductVersion());
		System.out.println("Driver Name:"+dbmd.getDriverName());
		System.out.println("Driver Version:"+dbmd.getDriverVersion());*/
		
		System.out.println("Database Name:"+ driverClass);
		System.out.println("Database Product version:"+url);
		System.out.println("Driver Name:"+username);
		System.out.println("Driver Version:"+pwd);
	}
}
