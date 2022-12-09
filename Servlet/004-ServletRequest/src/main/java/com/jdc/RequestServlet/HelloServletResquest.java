package com.jdc.RequestServlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
			name="Servlet",
			value="/hello",
			loadOnStartup = 1
		)
public class HelloServletResquest extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		log("Hello Servlet is Begin===>>>>>>>>");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		log("Servlet doGet Method is working!!!!");
		
		
		log(String.format("Name : %16s", req.getParameter("name")));
		log(String.format("Course : %16s ", req.getParameter("course")));
		
		resp.getWriter()
		.append("<h1>").append("Hello Servlet").append("</h1>").flush();
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log(String.format("Name ===> %14s ", req.getParameter("name")));
		log(String.format("Course ====> %14s ", req.getParameter("course")));
		
		resp.getWriter()
		.append("<h1 style=\" color: gray ; \">").append("Yes All is Well").append("</h1>").flush();
	}
	
	@Override
	public void destroy() {
		log("Servlet Destory !!!!!!!!!!!!!!!");
	}
}
