package com.jdc.tls;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("name"));
		System.out.println(req.getParameter("phone"));
		
		// resp.sendRedirect("ok");
		var path = req.getContextPath().concat("/Allright.jsp");
		resp.sendRedirect(path);
	}

}
