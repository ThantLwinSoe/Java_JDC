package com.jdc.tls;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/include")
public class MainBody extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Header
		getServletContext().getNamedDispatcher("HeaderMessage").include(req, resp);
		
		// Own Message
		resp.getWriter().append("<h1>I am Main</h1>");
		
		// Body from ServletContext use getRequestDispatcher method 
		getServletContext().getRequestDispatcher("/ok").include(req, resp);
		
		// Footer 
		req.getRequestDispatcher("./footer").include(req, resp);
	}
}
