<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="Menu.jsp" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list all leads</title>
</head>
<body>
<a href="/">Create new lead</a>
<h2>
list of leads
</h2>
<table>
<tr>
<th>First Name</th>
<th>LastName</th>
<th>Source</th>
<th>Email</th>
<th>Mobile</th>
</tr>
   <c:forEach var="lead" items="${leads}">

<tr>
<td> <a href="leadInfo?id=${lead.id}"> ${lead.firstName}</a></td>
<td>${lead.lastName}</td>
<td>${lead.source}</td>
<td>${lead.email }</td>
<td>${lead.mobile }</td>

</tr>
     </c:forEach>



</table>

</body>
</html>