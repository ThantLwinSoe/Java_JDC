package com.jdc.mkt;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class HelloListener implements ServletContextListener {
	
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("");
	}
	
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("hello Sevlet");
	}
}
