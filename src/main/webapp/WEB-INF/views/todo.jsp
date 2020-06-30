<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todos</title>
</head>
<body>
<p>Welcome ${name}</p>
<p>Your Todos are:</p>
<ol>
	<c:forEach items="${todos}" var="todo">
	<li>${todo.name}</li>
	</c:forEach>
</ol>
<form action="/todo.do" method="post">
	<input type="text" name="todo"/><input type="submit" value="Add"/>
</form>
</body>
</html>