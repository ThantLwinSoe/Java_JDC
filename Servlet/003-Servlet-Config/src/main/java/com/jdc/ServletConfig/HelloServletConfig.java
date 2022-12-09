package com.jdc.ServletConfig;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
			name = "Servlet Config",
			value="/hello",
			loadOnStartup = 1,
			initParams = {
					@WebInitParam(name="default Size", value="100"),
					@WebInitParam(name="wait Time", value="3"),
					@WebInitParam(name="time limit", value="Seconds")
			}
		)
public class HelloServletConfig extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		log("Servlet Starting !!!!!!!!!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log("do Get Working!!!!");
		
		log("Servlet Name : " + getServletName());
		log("Servlet Info : " + getServletInfo());
		
		var initParam = getInitParameterNames();
		
		while(initParam.hasMoreElements()) {
			var name = initParam.nextElement();
			log(String.format("%-19s : %s/n", name, getInitParameter(name)));
		}
		
		resp.getWriter()
		.append("<h1>").append("This is Servlet").append("</h1>").flush();
	}
	
	@Override
	public void destroy() {
		log("Servlet Destory!!!!!!!!!!!!!!!");
	}

}
