package com.jdc.tls.ok;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/footer")
public class Footer extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private static final String FOOTER = """
					<p>This is Footer of the pages</p>
				</body>
				</html>""";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append(FOOTER);
	}
}
