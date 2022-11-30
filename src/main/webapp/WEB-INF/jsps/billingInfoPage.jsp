<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Page</title>
</head>
<body>
<h3>Billing Page | Billing</h3>
<hr>
<form action="saveBill" method="post">
<pre>
Id         : <input type = "text" name = "id" value="${contact.id}" readonly/>
First Name : <input type = "text" name = "firstName" value="${contact.firstName}" readonly/>
Last  Name : <input type = "text" name = "lastName" value="${contact.lastName}" readonly/>
Email      : <input type = "email" name = "email" value="${contact.email}" readonly/>
Mobile     : <input type="text" name = "mobile" value="${contact.mobile}" readonly/>
product    : <input type = "text" name = "product">
Payment    : <input type = "text" name = "amount" />
Mode       : cash  <input type="radio" name="mode" value="cash">    
             online<input type="radio" name="mode" value="online">             
<input type = "submit" value="Billing">
</pre>
</form>
</body>
</html>