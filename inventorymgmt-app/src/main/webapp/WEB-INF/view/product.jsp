<%@page import="com.mastek.inventorymgmt.model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ProductDetails</title>
</head>
<body>
<c:if test="${not empty product}">
 <table>
	<tr>
		<td>${product.getProduct_id()}</td>
		<td>${product.getProduct_name()}</td>
		<td>${product.getUnit_price()}</td>
		<td>${product.getAvailale_qty()}</td>
	</tr>
</table>
</c:if>
</body>
</html>