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
System.out.println("Dummy");
Date date = new Date();
%>
<div>Current date is <%=date%></div>
<body>
Hello ${name} from JSP!
</body>
</html>