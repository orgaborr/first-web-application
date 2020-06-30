<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

<title>Todos</title>
</head>
<body>
<p>Welcome ${name}</p>
<p>Your Todos are:</p>
<ol>
	<c:forEach items="${todos}" var="todo">
		<li>${todo.name} &nbsp; &nbsp; <a href="delete-todo.do?todo=${todo.name}">Delete</a></li>
	</c:forEach>
</ol>
<form action="/todo.do" method="post">
	<input type="text" name="todo"/><input type="submit" value="Add"/>
</form>

<script src="webjars/jquery/1.9.1/css/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>