<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 22/11/2019
  Time: 11:15 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div>
  <h1>Product Discount Calculator </h1>
  <form method="post" action="discount">
      <label>Product Description</label>
      <input type="text" name="productDescription" placeholder="Product Description">
      <label>List Price</label>
    <input type="text" name="listPrice" placeholder="List Price">
      <label>Discount Percent</label>
    <input type="text" name="discountPercent" placeholder="Discount Percent">
    <input type="submit" id="sumbit" value="Submit">
  </form>
  </div>
  </body>
</html>
