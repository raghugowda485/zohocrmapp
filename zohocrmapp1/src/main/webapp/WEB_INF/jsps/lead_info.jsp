<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
<h2>Lead | Information</h2>

   Lead Id: ${lead.id} <br>
   FirstName: ${lead.firstName} <br>
   LastName: ${lead.lastName} <br>
   Source: ${lead.source} <br>
   Email: ${lead.email} <br>
   Mobile: ${lead.mobile} <br>
   <form action="convertLead" method="post">
   <input type= "hidden" name="id" value ="${lead.id }">
   <input type ="submit" value ="convert">
   
   </form>
   
   
</body>
</html>