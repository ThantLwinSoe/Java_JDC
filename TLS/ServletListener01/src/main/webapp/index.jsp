<%@ page import="com.jdc.shop.model.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		ProductModel model = (ProductModel) application.getAttribute("products");
	%>
	<h1>Hello Servlet Listener</h1>
	<h2>This is ServletContextListener</h2>
	
	<h1>Product List</h1>
	
	<table width="50%">
		<tr style="text-align: left">
			<th>ID</th>
			<th>Category</th>
			<th>Name</th>
			<th>Price</th>
			<th>Add</th>
		</tr>
		<%
			for(int i = 0; i < model.getList().size(); i ++){
				Product p = model.getList().get(i);
		%>
		<tr>
			<td><%= p.getId() %></td>
			<td><%= p.getName() %></td>
			<td><%= p.getCategory() %></td>
			<td><%= p.getPrice() %></td>
			<td><a href="cart-add?product=<%=p.getId() %>">Add to Cart</a></td>
		</tr>
		<%		
			}
		%>
	</table>
	
</body>
</html>