<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 06/12/2019
  Time: 10:38 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu Sandwich</title>
</head>
<body>
<h1> Menu Sandwich</h1>
<form name="/sandwich" method="post">
    <h1> Sandwich Condiment</h1>
    <label>Lettuce</label>
    <input type="checkbox" name="sandwich" value="Lettuce">
    <label>Tomato</label>
    <input type="checkbox" name="sandwich" value="Tomato">
    <label>Mustad</label>
    <input type="checkbox" name="sandwich" value="Mustad">
    <label>Sprouts</label>
    <input type="checkbox" name="sandwich" value="Sprouts">
    <input type="hidden" name="sandwich" value="Not found">
    <input type="submit" value=" Save">
</form>
</body>
</html>
