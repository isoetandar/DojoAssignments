<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.codingdojo.web.models.cat"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Cat</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  	<link rel="stylesheet" type="text/css" href="pets_stylesheet.css">
</head>
<body>
	<form action='/Dog' method='post'>
    <fieldset>
  	<legend>Make a Dog!</legend>
        <div class="dog-group">
          <label>Name</label>
          <input type="text" class="form-control" name='name' placeholder="Name">
          <label>Breed</label>
          <input type="text" class="form-control" name='breed' placeholder="Breed">
          <label>Weight (lb)</label>
          <input type="text" class="form-control" name='weight' placeholder="Weight"><br>
          <button title="Submit" id="submit" class="btn btn-primary">Submit</button>
        </div>
     </fieldset>
     </form>
    
    <form action='/Cat' method='post'> 
    <fieldset>
  	<legend>Make a Cat!</legend>   
        <div class="cat-group">
          <label>Name</label>
          <input type="text" class="form-control" name='name' placeholder="Name">
          <label>Breed</label>
          <input type="text" class="form-control" name='breed' placeholder="Breed">
          <label>Weight (lb)</label>
          <input type="text" class="form-control" name='weight' placeholder="Weight"><br>
          <button title="Submit" id="submit" class="btn btn-primary">Submit</button>
        </div>
   </fieldset>
   </form>	
</body>
</html>