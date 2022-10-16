<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Servlet Information</h1>
	<h3>Request information</h3>
	<a href="parameter?name=koko&pass=123">Send</a>
	<br/>
	
	<h3>Respond Information</h3>
	<form action = "parameter" method= "post">
		<table>
			<tr>
				<td>Name :</td>
				<td>
					<input type="text" name="user" placeholder="Type user name!">
				</td>
			</tr>
			<tr>
				<td>Password :</td>
				<td>
					<input type="password" name="pass" placeholder="Type Password!">
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="send">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>