package com.jdc.mkt.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdc.mkt.entity.Member;

public class ConnectionManager {

	private static final String URL = "jdbc:mysql://localhost:3306/test";
	private static final String USER = "root";
	private static final String PASS = "root";

	public Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(URL,USER,PASS);
		
	}
	
	public void testConnection() throws SQLException {
		String sql = "select * from member_tbl";
		
		List<Member> list = new ArrayList<>();
		try(Connection con = getConnection();
				PreparedStatement sta = con.prepareStatement(sql);
				) {
			
			var rs = sta.executeQuery();
			
			while(rs.next()) {
				Member m = new Member();
				
			
				
			}
			
		}
	}
}
