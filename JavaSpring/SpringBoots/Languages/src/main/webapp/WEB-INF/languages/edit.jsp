<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><c:out value="${language.name}"/></title>
</head>
<body>
<a href="/languages/delete/${id}">Delete</a>
<a href="/languages">Dash board</a>
<form:form action="/languages/edit/${id}" method="POST" modelAttribute="language">

<form:hidden path="id"/>

<form:label path="name">Name
<form:errors path="name"/>
<form:input path="name"/>
</form:label>

<form:label path="creator">Creator
<form:errors path="creator"/>
<form:input path="creator"/>
</form:label>


<form:label path="currentVersion">Version
<form:errors path="currentVersion"/>
<form:input path="currentVersion"/>
</form:label>

<input type="submit" value="Submit"/>
</form:form>
</body>
</html>