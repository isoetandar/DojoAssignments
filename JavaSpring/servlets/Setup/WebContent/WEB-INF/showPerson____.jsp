<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.codingdojo.web.models.Person"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Show Person Page</title>
</head>
<body>
	<% Person  person = (Person) request.getAttribute("person"); %>
	<%= person.greeting() %>
	
	<h1>Hello World</h1>
</body>
</html>