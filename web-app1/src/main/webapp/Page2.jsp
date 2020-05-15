<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page 2 </title>
</head>
<body>
HI <%=request.getAttribute("fname").toString() %>
HI <%=session.getAttribute("fname").toString() %>
<form action="S2" method="post">
Last Name <input type='text' name="lname" id="lname"/>
<input type="submit" value="Call S2"/>   
</form>
</body>
</html>