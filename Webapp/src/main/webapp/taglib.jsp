<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<c:if test="${3<2}"> this is true</c:if>


</body>
</html>