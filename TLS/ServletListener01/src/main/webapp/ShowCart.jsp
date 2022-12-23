<%@page import="java.text.DecimalFormat"%>
<%@page import="com.jdc.shop.model.ShoppingCart"%>
<%@page import="com.jdc.shop.model.entity.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>My Cart</h1>
	<h3>show cart details</h3>

	<%
	ShoppingCart sc = (ShoppingCart) session.getAttribute("cart");
	%>

	<%!String formatting(int data) {

		return new DecimalFormat("#,##0").format(data);
	}%>

	<table style="width: 50%">
		<tr>
			<td>Product Name</td>
			<td>Category</td>
			<td>Unit Price</td>
			<td>Count</td>
			<td>Unit Total</td>
		</tr>

		<%
		for (SaleItem item : sc.items()) {
		%>

		<tr>
			<td><%=item.getProduct().getName()%></td>
			<td><%=item.getProduct().getCategory()%></td>
			<td><%=formatting(item.getProduct().getPrice())%></td>
			<td>
			<!--  Minus -->
				<a href="cart-minus?product=<%=item.getProduct().getId()%>">-</a>
				<%=formatting(item.getCount())%>
			<!-- Plus -->
				<a href="cart-plus?product=<%=item.getProduct().getId()%>">+</a>
			</td>
			<td><%=formatting(item.getTotal())%></td>
		</tr>


		<%
		}
		%>

		<tr>
			<td colspan="4">Total</td>
			<td><%=formatting(sc.total())%></td>
		</tr>


	</table>
	<p>
		<a href="index.jsp">Back To Home</a>
	</p>
</body>
</html>