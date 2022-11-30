<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Contact</title>
</head>
<body>
<h3>Display Contact</h3>
<hr>
<table border="1">
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Lead Source</th>
<th>mobile</th>
<th>Billing</th>
</tr>
<c:forEach var = "contact" items="${contact}" >
<tr>
<td>${contact.id}</td>
<td><a href = "getContactById?id=${contact.id}">${contact.firstName}</td>
<td>${contact.lastName}</td>
<td>${contact.email}</td>
<td>${contact.leadSource}</td>
<td>${contact.mobile}</td>
<td><a href = "getBillById?id=${contact.id}">select</a></td>

</tr>
</c:forEach>
</table>
</body>
</html>