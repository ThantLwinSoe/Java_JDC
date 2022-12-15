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
	"/cart-clear"
})
public class ShoppingCartServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		switch (req.getServletPath()) {
		case "cart-add":
			addToCart(req, resp);
			break;
		case "cart-show":
			break;
		case "cart-clear":
			break;
		
		}	
		
	}
	
	public void addToCart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// get ProductID
		var pid = req.getParameter("product");
		
		// get Product Model from Application Scope
		var productModel = (ProductModel) getServletContext().getAttribute("products");
		
		// find product from model by id 
		Product product = productModel.findById(Integer.parseInt(pid));
		// get Shopping cart from session scope
		var session = req.getSession(true);
		
		var cart = (ShoppingCart)session.getAttribute("cart");
		
		if(null == cart ) {
			// create shopping cart
			ShoppingCart.generate();
			//add cart to session scope
			session.setAttribute("cart", cart);
			
		}
		// add product to cart 
		cart.add(product);
		// forward to index.jsp
		getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
	}

}
