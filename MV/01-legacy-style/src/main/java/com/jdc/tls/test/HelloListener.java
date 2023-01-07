package com.jdc.tls.test;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class HelloListener implements ServletContextAttributeListener,ServletRequestListener{

	
	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("attribute added listener.");
	}
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("requestInitialized");

	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request destory");
	}
}
