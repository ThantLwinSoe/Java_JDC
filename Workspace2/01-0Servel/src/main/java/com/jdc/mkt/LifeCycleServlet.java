package com.jdc.mkt;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class LifeCycleServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		System.out.println("Servlet initalizing");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append("""
				<h1>Servlet LifeCycle</h1>
				<h1>This is Servlet Life Cycle</h1>
				""").flush();
		System.out.println("Servicing Servlet!!!");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroyed!!!");
	}

}
