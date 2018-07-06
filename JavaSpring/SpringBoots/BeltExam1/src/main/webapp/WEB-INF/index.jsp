<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Index</title>
    <link type="text/css" rel="stylesheet" href="../css/stylesheet.css" >
</head>
<body>
	<form method="post" action="/login">
  		<div class="header">
    		<c:out value="${error}" />
    		<h5>Login</h5>
    		<input type="text" id="email" name="email" placeholder="Email"/>
       		<input type="password" id="password" name="password" placeholder="Password"/>
        	<input type="submit" value="Login"/>      	
    	</div>
    </form>
    <p class="horizontal_menu"> MySQL | Django | AJAX | Java | Javascript | Python | Algos | About | <a href="/registration">Registration! </a></p>	
    <div id="mainContainer">
    	<div class="mainsub1"><p id="vertext">Games</div>
    	<div class="mainsub2">Tesla</div>
    	<div class="mainsub3"><p id="vertext1">Apple</div>
    	<div class="mainsub4">Space News</div>
    </div>
    <div class="footer"></div>
</body>
</html>