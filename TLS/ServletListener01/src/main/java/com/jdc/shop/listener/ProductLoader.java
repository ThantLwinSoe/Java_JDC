package com.jdc.shop.listener;


import java.io.BufferedReader;
import java.io.FileReader;

import com.jdc.shop.model.ProductModel;
import com.jdc.shop.model.entity.Product;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
@WebListener
public class ProductLoader implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		// Create Product Model
		ProductModel model = new ProductModel();
		
		// Add Product Model to Application Scope
		sce.getServletContext().setAttribute("products", model);
		
		// Read File
		// set File Path 
		String filePath = sce.getServletContext().getRealPath("/WEB-INF/Info.txt");
		
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			
			String line = null;
			
			while(null != (line=reader.readLine())) {
				var array = line.split("\t");
				model.add(new Product(array[0],array[1],Integer.parseInt(array[2])));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
