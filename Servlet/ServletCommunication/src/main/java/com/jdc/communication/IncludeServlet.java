package com.jdc.communication;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Include Message ( Relative Path) From ServletResquest	
		var header = req.getRequestDispatcher("./header");
		header.include(req, resp);
		
		
		// Include Message (Name Dispatcher) From ServletContext
		
		var context = getServletContext();
		
		var message = context.getNamedDispatcher("Include-Message");
		
		message.include(req, resp);
		
		// Own Message 
		resp.getWriter().append("<p>Hello Own Message</p>");
		
		// Include Message (Absolute Path) From ServletContext
		var footer = context.getRequestDispatcher("/footer");
		footer.include(req, resp);
		
	}
}
