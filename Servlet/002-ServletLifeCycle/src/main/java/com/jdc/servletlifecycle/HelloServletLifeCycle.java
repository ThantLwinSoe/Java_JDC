package com.jdc.servletlifecycle;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = "/hello")
@WebServlet(
		name = "HelloServletLifeCycle",
		value = "/hello",
		loadOnStartup = 1
		)
public class HelloServletLifeCycle extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		log("Hello Servlet initialize");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log("do get another thread!!!");
		resp.getWriter()
		.append("<h1>").append("Hello Servlet Life Cycle").append("</h1>").flush();
	}
	
	@Override
	public void destroy() {
		log("Servlet Destory!!!");
	}

}
