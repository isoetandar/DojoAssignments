<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
    <link type="text/css" rel="stylesheet" href="../css/stylesheet_register.css" >
</head>
<body>
  <div id="registrar">
    <h1>Register!</h1>
    <p><form:errors path="user.*"/></p>
    <form:form method="POST" action="/registration" modelAttribute="user">
        <p><form:input type="name" path="name" placeholder="Name"/></p>
        <p><form:input type="email" path="email" placeholder="Email"/></p>
        <p><form:password path="password" placeholder="Password"/></p>
        <p><form:password path="passwordConfirmation" placeholder="Password Confirmation"/></p><br>
        <input type="submit" value="Register!"/>
    </form:form>
  </div>
</body>
</html>