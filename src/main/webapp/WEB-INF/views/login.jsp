<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Sample</title>
</head>
<%
Date date = new Date();
%>
<div>Current date is <%=date%></div><br>
<body>
<form action="/login.do" method="post">
<p><font color="red">${errorMessage}</font></p>
Name: <input type="text" name="name"/> Password: <input type="password" name="password"/><input type="submit" value="Login"/>
</form>
</body>
</html>