package com.tls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnection {
	
	private static final String USER = "root";
	private static final String PASS = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/mydb1?useSSL=false";
	
	static Connection getConnection() {
		
		Connection con = null ;
		
		try {
			con = DriverManager.getConnection(URL,USER,PASS);
		} catch (Exception e) {
			System.out.println("Something went wrong" + e);
		}
		return con;
	}

}
