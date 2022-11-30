<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Lead</title>
</head>
<body>
<h3>Display Lead</h3>
<hr>
<table border="1">
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Lead Source</th>
<th>mobile</th>
</tr>
<c:forEach var = "lead" items="${lead}" >
<tr>
<td>${lead.id}</td>
<td><a href = "getLeadById?id=${lead.id}">${lead.firstName}</td>
<td>${lead.lastName}</td>
<td>${lead.email}</td>
<td>${lead.leadSource}</td>
<td>${lead.mobile}</td>
</tr>
</c:forEach>
</table>
</body>
</html>