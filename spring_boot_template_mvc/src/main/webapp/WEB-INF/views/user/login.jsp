<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<h4 style="color:red;">${requestScope.mesg}</h4>
	<form method="post" >
		<table style="background-color: cornsilk; margin: auto">
			<tr>
				<td>Enter your Email</td>
				<td><input type="text" name="em"/></td>
			</tr>
			<tr>
				<td>Enter your Password</td>
				<td><input type="password" name="pass" /></td>
			</tr>
			<tr>
			<td><input type="submit" value="login" /></td>
			
			</tr>
			</table>

	</form>
    
</body>
</html>