<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.jdc.tls.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
<style>
	body {
		margin: 0;
		min-height: 100vh;
		padding: 4rem;
	}
	
	table {
		width: 70%;
		border-collapse: collapse;
		
	}
</style>
</head>
<body>
	<h1>Test File Upload</h1>
	
	<form method="post" enctype="multipart/form-data" action="upload">
		<label >Select File</label>
		<input type="file" name="uploadFile"/>
		<button type="submit">Upload</button>
	</form>
	
	<br />
	<hr />
	
	<%
		@SuppressWarnings("unchecked")
		List<Sale> list = (List<Sale>)request.getAttribute("file");
	
		if(null != list && list.isEmpty()) {
	%>		
		<table >
			<thead>
				<th>Category</td>
				<th>Product name</th>
				<th>price</th>
				<th>count</th>
				<th>total</th>
			</thead>
			
			<tbody>
					<%
					for(Sale s : list) {
					%>
						<td><%=s.getCategory() %></td>
						<td><%=s.getProductName() %></td>
						<td><%=s.getPrice() %></td>
						<td><%=s.getCount() %></td>
						<td><%=s.getTotal() %></td>
					<% 		
						}
				
					%>
			</tbody>
		</table>
		
		
	<% 		
		}
	%>
	
	
	
	
	
</body>
</html>