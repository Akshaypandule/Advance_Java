<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Taglib directive tutorial</h3>
	<c:set var="name" value="Akshay"></c:set>
<c:out value="${name}"></c:out><br>

<!--  Find out the length of string -->
	<c:out value="${fn:length(name) }"></c:out>
	<c:out value="${fn:toLowerCase(name)}"></c:out>
</body>
</html>