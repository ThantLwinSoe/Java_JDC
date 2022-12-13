
<%@ page import="com.jdc.tls.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scope</title>
</head>
<body>
	<h1>Servlet Scope</h1>
	<table>
		<tr>
			<td>Request Scope:</td>
			<td>
				<%
				Counter c1 = (Counter) request.getAttribute("counter");
				out.append(c1 == null ? "0": c1.getCounter().toString()); 
				
				%>
			</td>
		</tr>
		<tr>
			<td>Session Scope:</td>
			<td>
				<%
				Counter c2 = (Counter) session.getAttribute("counter");
				out.append(c2 == null ? "0": c2.getCounter().toString()); 
				
				%>			
			
			</td>
		</tr>
		<tr>
			<td>Application Scope:</td>
			<td>
				<%
				Counter c3 = (Counter) application.getAttribute("counter");
				out.append(c3 == null ? "0": c3.getCounter().toString()); 
				
				%>			
			</td>
		</tr>
		<tr>
			<td></td>
			<td>
				<a href="counter">Count Up</a>
			</td>
		</tr>
	</table>
</body>
</html>