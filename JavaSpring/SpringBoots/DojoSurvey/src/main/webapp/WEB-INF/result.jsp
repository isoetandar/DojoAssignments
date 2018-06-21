<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Dojo Survey</title>
	<style>
	fieldset {
		width:300px;
	}
	</style>
</head>
<body>
<fieldset>
	<legend>Submitted Info</legend>
	<table>
		<tr>
		<td>Name:</td>
		<td><c:out value="${name}"/></td>
		</tr>
		
		<tr>
		<td>Location:</td>
		<td><c:out value="${location}"/></td>
		</tr>
		
		<tr>
		<td>Favorite Language:</td>
		<td><c:out value="${language}"/></td>
		</tr>
		
		<tr>
		<td>Comment:</td>
		<td><c:out value="${comment}"/></td>
		</tr>
	</table>
</fieldset>
</body>
</html>