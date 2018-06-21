<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8"/>
	<link rel="stylesheet" type="text/css" href="draw_style.css">
	<title>Draw Checkboard</title>
</head>
<body>

<% int reqWidth = Integer.parseInt(request.getParameter("width")); %> 
<% int reqHeight = Integer.parseInt(request.getParameter("height")); %>
<h1>Checkerboard: <%= reqWidth %> w X <%= reqHeight %> h</h1>


<div class="container">
<% for (int i=0; i<reqHeight; i++) { %>
	<% for (int j=0; j<reqWidth; j++) { %>
		<% if ((i+j)%2 == 1) { %>
			<div class="inline blue"></div>
		<% } else { %>
			<div class="inline red"></div>
			<% } %>
		<% } %>
		<br>
	<% } %>
</div>
</body>
</html>