<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet Filter</title>
</head>
<body>
	<h1>Servlet Filter Home</h1>
	
	<p>
		<%=request.getAttribute("message") %>
	</p>
	
	<a href="index.html">Home</a>
</body>
</html>