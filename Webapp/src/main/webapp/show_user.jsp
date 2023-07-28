<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>All user are</h1>

<s:setDataSource driver="com.jdbc.mysql.Driver" url="jdbc:mysql://localhost:3306/myhibernet" user="root" password="1234" var="ds"/>
<s:query dataSource="${ds}">select*from question</s:query>
<c:forEach items="${rd.rows}"></c:forEach>

</body>
</html>