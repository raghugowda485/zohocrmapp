<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
<h2>Create | Lead</h2>


<form action="generateBill" method="post">

First Name <input type="text" name="firstName">
<br>
Last Name <input type="text" name="lastName">
<br>
Email <input type="email" name="email">
<br>
Mobile <input type="text" name="mobile">
<br>
Product <input type ="text" name="product">
<br>
Amount <input type="text" name="amount">
<br>
<input type="submit" value="generate bill"/>

</form>
</body>
</html>