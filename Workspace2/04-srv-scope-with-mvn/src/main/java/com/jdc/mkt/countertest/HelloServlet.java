package com.jdc.mkt.countertest;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var name = req.getParameter("name");
		System.out.println(name);
		Cookie ck = new Cookie("ck_name", "hello");
		ck.setMaxAge(30);
		resp.addCookie(ck);
		getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
	}
	

}
