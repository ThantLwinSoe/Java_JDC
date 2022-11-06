package com.tls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class main {
		
	public static void main(String [] args) {
		
		try(Connection con = DBConnection.getConnection();
			PreparedStatement select = con.prepareStatement("select * from employees");
				
				){
			
			ResultSet rs = select.executeQuery();
			System.out.println("ok1");
			showData(rs);
			
		} catch (Exception e) {
					e.printStackTrace();
				}
	}

	private static void showData(ResultSet rs) throws SQLException {
		
		List<Employee> list = new ArrayList<>();
		
		while(rs.next()) {
			
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int da = rs.getInt(3);
			double salary = rs.getDouble(4);
			
			Employee e = new Employee(id, name, salary, new Department());
			System.out.println("ok");
			list.add(e);
			
		}
		list.forEach(System.out :: println);
	}

}
