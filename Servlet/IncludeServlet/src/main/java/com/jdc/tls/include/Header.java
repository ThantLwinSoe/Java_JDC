package com.jdc.tls.include;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(
			name = "HeaderMessage",
			value = "header"
		)
public class Header extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private static final String HEADER = """
				<!DOCTYPE html>
				<html>
				<head>
				<meta charset='UTF-8'>
				<title>Insert title here</title>
				</head>
				<body>""";
	private static final String message= "<h3>This is A Header Message</h3>";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append(HEADER).append(message);
	}
}
