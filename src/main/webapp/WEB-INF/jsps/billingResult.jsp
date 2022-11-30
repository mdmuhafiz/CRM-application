<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Result</title>
</head>
<body>
<h3>Billing Result | Result</h3>
<hr>
Id:${bill.id}<br/>
First Name:${bill.firstName}<br/>
Last Name:${bill.lastName}<br/>
Email:${bill.email}<br/>
Mobile:${bill.mobile}<br/>
Product:${bill.product}<br/>
Payment:${bill.amount}<br/>
Mode:${bill.mode}<br/>

<form action="sendEmail" method="post">
<input type = "hidden" name = "email" value="${bill.email}" />
<input type = "submit" value="send email">
</form>

</body>
</html>