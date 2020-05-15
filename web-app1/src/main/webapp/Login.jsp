<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="style.css" rel="stylesheet"/> 
<!-- <style>
nav{
    display: inline-block;
    background-color: cyan;
    width:100%;
    height: 20px;
    color:navy;
    font-size: 13px;
    padding:2px;
    margin: 2px;
    border:solid 2px navy;
}
</style>
 -->
</head>
<body>
<nav>
    <a href="index.jsp">Index</a>
</nav>
<%
    String err_message=(String)request.getAttribute("error");
    if(err_message!=null){
        out.print(err_message);
    }
%>
    <form action="login" method="post">
    <pre>
        User Name<input type="text" name="username" id="username"> 
        Password<input type="password" name="password" id="password">
        <input type="submit" value="Login">
    </pre>
    </form>

 

</body>
</html>