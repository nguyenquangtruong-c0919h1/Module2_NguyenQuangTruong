<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 09/12/2019
  Time: 9:30 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Caculater</h1>
<form method="post" action="/home">
    <input type="text" name="number1">
    <select name="operator">
        <option value="+"> +</option>
        <option value="-"> -</option>
        <option value="*"> *</option>
        <option value="/"> /</option>
    </select>
    <input type="text" name="number2">
    <input type="submit" value="OK Baby">
</form>
</body>
</html>
