<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Session Counter</title>
</head>
<body>
	<p>You have visited <a href='/'>localhost:8080</a>
<span id="counter"><c:out value="${counter}"/></span>
times.
</p>
<br>
<a href="/">Test another visit?</a>
</body>
</html>