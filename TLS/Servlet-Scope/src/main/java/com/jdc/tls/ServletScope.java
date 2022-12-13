package com.jdc.tls;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/counter")
public class ServletScope extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private static final String COUNTER = "counter";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Request
		Counter c1 = (Counter) req.getAttribute(COUNTER);
		if(c1 == null) {
			c1 = new Counter();
			req.setAttribute(COUNTER, c1);
		}
		c1.countUp();
		
		// Session
		HttpSession session = req.getSession(true);
		Counter c2 = (Counter) session.getAttribute(COUNTER);
		if(c2 == null) {
			c2 = new Counter();
			session.setAttribute(COUNTER, c2);
		}
		c2.countUp();
		
		// Application
		ServletContext application = getServletContext();
		Counter c3 = (Counter) application.getAttribute(COUNTER);
		if(c3 == null) {
			c3 = new Counter();
			application.setAttribute(COUNTER, c3);
		}
		c3.countUp();
		
		// Forward
		application.getRequestDispatcher("/scope.jsp").forward(req, resp);
	}
}
