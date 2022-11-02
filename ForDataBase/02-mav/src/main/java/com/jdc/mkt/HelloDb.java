package com.jdc.mkt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HelloDb {
	
	private static final String URL="jdbc:mysql://localhost:3306/test";
	private static final String USER="root";
	private static final String PASS="root";
	
	public static void main(String[] args) {
		
		String query="select * from person";
		
		System.out.println("ok");
		
		try(Connection con = DriverManager.getConnection(URL, USER, PASS);
				
			PreparedStatement stmt = con.prepareStatement(query);	
				) {
			
			System.out.println("ok");
			ResultSet rs = stmt.executeQuery();
			
			
			while(rs.next()) {
				System.out.println(
						
						rs.getInt("person_id") +
						"\t" + rs.getString("name") +
						"\t" + rs.getInt("age")
						
						);
			}
			
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
