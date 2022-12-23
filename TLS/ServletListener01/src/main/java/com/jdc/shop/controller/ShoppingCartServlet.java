package com.jdc.shop.controller;

import java.io.IOException;


import com.jdc.shop.model.ProductModel;
import com.jdc.shop.model.ShoppingCart;
import com.jdc.shop.model.entity.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({
	"/cart-add", 
	"/cart-show",
	"/cart-clear",
	"/cart-plus",
	"/cart-minus"
})
public class ShoppingCartServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		switch (req.getServletPath()) {
		case "/cart-add":
			addToCart(req, resp);
			break;
		case "/cart-show":
			getServletContext().getRequestDispatcher("/ShowCart.jsp").forward(req, resp);
			break;
		case "/cart-clear":
			clearToCart(req,resp);
			break;
		case "/cart-plus":
		case "/cart-minus":
			getCountOperation(req,resp);
			break;
		
		}	
		
	}
	
	private void getCountOperation(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		// Shopping Cart from Session Scope
		var cart = (ShoppingCart)req.getSession().getAttribute("cart");
		
		// plus or minus
		var plus = req.getServletPath().equals("/cart-plus");
		
		// get productID from parameter 
		var product = req.getParameter("product");
		
		// operation plus or minus
		cart.operation(plus, Integer.parseInt(product));
		// Redirect
		var path = req.getContextPath().concat("/ShowCart.jsp");
		resp.sendRedirect(path);
	}

	public void clearToCart(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		
		// get session
		var session = req.getSession();
		// clear cart 
		if(session != null) {
			var shopingcart = (ShoppingCart)session.getAttribute("cart");
			shopingcart.clear();
		}
		
		// forward
		getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		
	}
	
	public void addToCart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// get ProductID
		var pid = req.getParameter("product");
		
		System.out.println(pid);
		
		// get Product Model from Application Scope
		var productModel = (ProductModel) getServletContext().getAttribute("products");
		
		// find product from model by id 
		Product product = productModel.findById(Integer.parseInt(pid));
		// get Shopping cart from session scope
		var session = req.getSession(true);
		
		var cart = (ShoppingCart) session.getAttribute("cart");
		
		if(null == cart ) {
			// create shopping cart
			cart = ShoppingCart.generate();
			//add cart to session scope
			session.setAttribute("cart", cart);
			
		}
		// add product to cart 
		cart.add(product);
		// forward to index.jsp
		getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
	}

}
