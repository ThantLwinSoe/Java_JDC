package com.jdc.tls;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getServletContext().getRequestDispatcher("/Servlet.jsp").forward(request, response);
		
		switch (request.getServletPath()) {
		case "/hello-Servlet":
			request.setAttribute("message", "Hello Servlet Request from hello");
			getServletContext().getRequestDispatcher("/Servlet.jsp").forward(request, response);
			break;
		case "/countUP":
			countUp(request);
			getServletContext().getRequestDispatcher("/filter.jsp").forward(request, response);
			break;
		case "/servlet-listener" : 
			getServletContext().getRequestDispatcher("/listener.jsp").forward(request, response);
			break;
		

		default:
			break;
		}
	}
	
	private void countUp(HttpServletRequest req) {
		HttpSession session = req.getSession(true);
		var obj = session.getAttribute("session");
		int count = 0;
		if(null != obj) {
			count = Integer.parseInt(obj.toString());
		}
		
		count ++;
		session.setAttribute("session", count);
		req.setAttribute("message", String.format("Count : %d", count));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
