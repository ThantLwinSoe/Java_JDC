package com.jdc.tls.dis;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/forward/main")
public class ToForward extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// header 
		getServletContext().getRequestDispatcher("/head").include(req, resp);
		// Own 
		resp.getWriter().append("<h1>Forward Body</h1>");
		
		// Body
		getServletContext().getRequestDispatcher("/ok").include(req, resp);
		
		// Footer
		getServletContext().getRequestDispatcher("/footer").include(req, resp);
		
	}

}
