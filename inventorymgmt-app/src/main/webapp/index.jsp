
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<div>
<a href="inventory/products">All Products</a><br/>

<form method="post" action="inventory/save">
	<pre>
Product ID			<input type="text" name="product_id" id="product_id"/>
Product Name		<input type="text" name=" product_name" id=" product_name"/>
Unit Price			<input type="number" name="unit_price" id="unit_price"/>
Available  Quantity	<input type="number" name="available_qty" id="available_qty"/>
	<input type="submit" value="Save"/>	
	</pre>
</form>

<form method="post" action="inventory/delete">
	<pre>
Product ID	<input type="text" name="product_id" id="product_id"/>
	<input type="submit" value="Delete"/>	
	</pre>
</form>
	
</div>
</body>
</html>