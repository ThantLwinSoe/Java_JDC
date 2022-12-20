package com.jdc.tls;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<String> list = Arrays.asList("Aung Aung","Mo Mo","Hla Hla");
		
		req.setAttribute("hi", list);
		getServletContext().getRequestDispatcher("/hello.jsp").forward(req, resp);
		
	}
}
