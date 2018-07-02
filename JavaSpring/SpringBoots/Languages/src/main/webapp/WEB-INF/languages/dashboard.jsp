<!DOCTYPE html>
<html lang="en">
<head>
  <title>Dash Board Languages</title>
  <meta charset="utf-8">
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
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
  </style>
</head>
<body>

<div class="container">
  <h2>Dash Board</h2>
  <p>Languages = Creator = Current Version Info</p>            
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Language</th>
        <th>Creator</th>
        <th>Current Version</th>
        <th>Actions</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${languages}" var="language">
        <tr>
            <td><a href="/languages/<c:out value="${language.id}"/>"><c:out value="${language.name}"/></a></td>
            <td><c:out value="${language.creator}"/></td>
            <td><c:out value="${language.currentVersion}"/></td>
            <td><a href="/languages/delete/${language.id}">delete</a></td> 
			<td><a href="/languages/edit/${language.id}">edit</a></td>
        </tr>
       </c:forEach>
    </tbody>
  </table>
<!-- <a href="/languages/new">New Language</a> -->
<h4>Add New Language</h4>
<form:form action="/languages/add" method="post" modelAttribute="language">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator"/>
    </p>
    <p>
        <form:label path="currentVersion">Version</form:label>
        <form:errors path="currentVersion"/>
        <form:input path="currentVersion"/>
    </p>
      
    <input type="submit" value="Submit"/>
</form:form>  
</div>

</body>
</html>