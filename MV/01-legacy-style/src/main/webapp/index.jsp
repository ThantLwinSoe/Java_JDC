<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello EveryOne This is index Jsp</h1>
	
	<c:url var="greet" value="/One">
		<c:param name="age" value="11"></c:param>
	</c:url>
	
	<a href="${greet}">Click Here To hello jsp</a>
	
<!--	<a href="One?age=12">Click Here To hello jsp</a> -->
</body>
</html>