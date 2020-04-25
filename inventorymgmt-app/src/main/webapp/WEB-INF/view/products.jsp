<%@page import="com.mastek.inventorymgmt.model.Product"%>
<%@page import="java.util.List"%>
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
	<table>
		<c:forEach var="product" items="${products}">
			<tr>
				<td><a href="product/${product.getProduct_id()}">${product.getProduct_id()} </a></td>
				<td>${product.getProduct_name()}</td>
				<td>${product.getUnit_price()}</td>
				<td>${product.getAvailable_qty()}</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>