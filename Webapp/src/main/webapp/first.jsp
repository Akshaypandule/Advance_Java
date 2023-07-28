<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="java.util.Random" %>
   <%@page isErrorPage="false" %>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="form.html" %>
  <h1> Random number:
   <% Random r=new Random();
   		int n=r.nextInt(100);
   		
   	   
   %>
   <%= n %></h1>
   
   

</body>
</html>