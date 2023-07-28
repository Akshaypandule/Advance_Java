<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jstl tags</title>
</head>
<body>

	<h1>This is JSTL tags</h1>
	<!--  Out tag -->
	
	<!-- Set tag -->
	<c:set var="i" value="23" scope="application"></c:set>
	<h1><c:out value="${i}"></c:out></h1>
	
	<!--  If tags used for condition check : Test the condition -->
	<c:if test="${i==23}">
		<h1>Yes i is 23 and condition is true</h1>
	</c:if>
	
	<!--  choose ,when, otherwise: all tags  java Switch  -->
		<c:choose>
			<c:when test="${i>0}">
				<h1>This my first case</h1>
			</c:when>
			<c:when test="${i<0}">
			 <h1> This my second case</h1>
			</c:when>
			
			<c:otherwise>
				<h1> otherwise number is zero</h1>
			</c:otherwise>
		
		</c:choose>
		
		<!-- For each tag for number of time repetation-->
		<c:forEach var="j" begin="1" end="10">
		<h1><c:out value="${j}"></c:out></h1>
		</c:forEach>
		
		<!--  Redirect tag -->
		<c:url var="myurl" value="http://www.google.com">
			<c:param name="q" value="youtube"></c:param>
		</c:url>
		
		<c:redirect url="${myurl}"></c:redirect>
		<c:out value="${myurl}"></c:out>
		<br>
		
	
	<!-- Remove tags -->
	<c:remove var="i"/>
	<c:out value="${i}">This is default value</c:out>
	
	<br>
	
	
</body>
</html>