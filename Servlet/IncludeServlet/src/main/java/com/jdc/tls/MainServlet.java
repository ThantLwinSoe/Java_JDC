package com.jdc.tls;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/include")
public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Include Method for Header from ServletContext
		getServletContext().getNamedDispatcher("HeaderMessage").include(req, resp);
		
		// Include Method for Footer form ServletContext
		getServletContext().getRequestDispatcher("/footer").include(req, resp);
	}
}
