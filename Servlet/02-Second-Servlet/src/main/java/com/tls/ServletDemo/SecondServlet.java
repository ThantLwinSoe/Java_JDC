package com.tls.ServletDemo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add")
public class SecondServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override // doGet method will display on the url about of information But doPost does not show
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i +j ;
		
		resp.getWriter().println("Result is :" + k);
	}
	
	
}
