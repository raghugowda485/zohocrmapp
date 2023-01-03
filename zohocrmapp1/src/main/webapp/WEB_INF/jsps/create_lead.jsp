<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
<h2>Create|Lead</h2>


<form action="saveLead" method="post">

First Name <input type="text" name="firstName">
<br>
Last Name <input type="text" name="lastName">
<br>
Source <select name="source" >
  <option value="newspaper">newspaper</option>
  <option value="online">online</option>
  <option value="radio">radio</option>
  <option value="Tv commercial">tv commercial</option>
</select>
<br>
Email <input type="email" name="email">
<br>
Mobile <input type="text" name="mobile">
<br>
<input type="submit" value="save"/>

</form>
</body>
</html>