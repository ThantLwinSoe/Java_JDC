package com.jdc.tls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/upload")
@MultipartConfig
public class UploadServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		var path = req.getPart("uploadFile");
		var list = new ArrayList<String>();
//		System.out.println(path.getClass().toString());
		try(var reader = new BufferedReader(new InputStreamReader(path.getInputStream()))){
			
			String word = null;
			
			while(null != (word = reader.readLine())) {
				list.add(word);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("file", list.stream().skip(1).map(Sale::new).toList());
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
	}

}
