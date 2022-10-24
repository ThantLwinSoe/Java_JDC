<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	.card {
		display: flex;
		width: 300px;
		padding: 1.5rem; 
		background-color: black;
//		border-color: white;
		border-radius: 20px;
		
		margin-top: 10 px;
		color: white;
	}
	
	body{
		padding: 2em;
	}

</style>
<body>
	<h1>Hello JSP</h1>
	<%! String name; %>
/*	<% 
		name = "Hello Servlet";
	%>
	<%		for (int i=0; i<5 ; i++){	%>
*/	
	<div class="card">
	<a href="hello?name=<%= name %>">Cookie Test</a>
	
	</div>
	
	
//	<% }%>
	
</body>
</html>