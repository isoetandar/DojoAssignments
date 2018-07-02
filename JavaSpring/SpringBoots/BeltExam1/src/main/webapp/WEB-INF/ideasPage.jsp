<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ideas</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
  <style>
  .container {
  	width: 50%;
  }
  .form-control {
  	width: 50%;
  	margin-left:30%;
  }
  .col-sm-2.col-sm-2 {
  	width: 50%;
  }
  button {
  	align: right;
  }
  label {
  	width: 100px;
  }
  input {
  	width: 200px;
  }
  h1 {
  	text-align : center;
  }
  </style>
	
</head>
<body>
	<h1>Welcome, <c:out value="${user.name}" /></h1><br>
	
<div class="container">
  <h2>Ideas</h2>           
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Idea</th>
        <th>Created By:</th>
        <th>Like</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${ideas}" var="idea">
        <tr>
           	<td><c:out value="${idea.idea}"/></td>
            <td><c:out value="${idea.createdBy}"/></td>
        </tr>
       </c:forEach>
    </tbody>
  </table>
  <form action="/ideas/new">
  	<button>Create an idea</button>
  </form>
</div>	
</body>
</html>



