<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<br />
	<br />
	<c:url var="hell" value="/hello"></c:url>
	<a href="${hell}">Hello Message</a>
	
	<br />
	<br />
	
	<c:set var="v" scope="page" value="Hello Test"></c:set>
	<c:out value="${v.toUpperCase()}"></c:out>
	<br />
	<br />
	
	
	
	<c:forEach var="hi" items="${list} ">
		<p>We are testing ${hi}</p>
	</c:forEach>
</body>
</html>