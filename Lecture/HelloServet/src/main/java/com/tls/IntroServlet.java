package com.tls;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns = "/hello")
public class IntroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req,  HttpServletResponse resp) throws IOException {
			
		resp.getWriter().append("""
				<h1> Hello Servlet</h1>
				""").flush();
	}
}
