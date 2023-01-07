package com.jdc.tls.test;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

@WebFilter("/One")
public class HelloFilter extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("destroyed filter");
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		int age = Integer.parseInt(req.getParameter("age"));
		if(age > 18) {
			chain.doFilter(req, res);
		} else {
			
			req.setAttribute("err", "Cannot open Buddy");
			getServletContext().getRequestDispatcher("/error.jsp").forward(req, res);
		//	System.out.println("Cannot open Buddy.Find OtherPlace");
		}
		
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Initiate Filter");
	}
}
