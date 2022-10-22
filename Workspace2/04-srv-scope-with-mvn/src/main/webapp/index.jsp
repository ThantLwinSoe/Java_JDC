<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scope Demo</title>
</head>
<body>
	<h1>JSP</h1>
	<table>
		<tr>
			<td>Scriptlet</td>
			<td>
				<% 
				name = "Hello JSP";
				%>
			</td>
			
		</tr>
		<tr>
			<td>Declaration :</td>
			<td>
				<%! String name;  %>
			</td>
			
		</tr>
		<tr>
			<td>Expression :</td>
			<td>
				<%= name %>
			</td>
			
		</tr>
	</table>

</body>
</html>