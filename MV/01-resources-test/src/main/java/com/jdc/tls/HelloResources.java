package com.jdc.tls;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/")
public class HelloResources extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			getNameMemberTable();
		} catch (SQLException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Connection getConnection() throws NamingException, SQLException {
		
		InitialContext ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/test");
		return ds.getConnection();		
	}
	
	private void getNameMemberTable() throws SQLException, NamingException {
		String sql = "select * from member_tbl";
		try(Connection con =getConnection();
			var stat = con.prepareStatement(sql)) {
			
			var rs = stat.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("user"));
			}
		}
	}
}
