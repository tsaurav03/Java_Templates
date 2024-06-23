<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blogger Home Page</title>
</head>
<body>
<h4>Login Successful !</h4>
	<h5>Welcome , ${sessionScope.user_dtls.firstName}
		${sessionScope.user_dtls.lastName}</h5>
	<%-- display all blogs --%>
	<c:url var="url" value="/user/logout" />
	<h5><a href="${url}">Log Me Out</a></h5>
</body>
</html>