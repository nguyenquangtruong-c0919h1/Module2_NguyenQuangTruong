<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 04/12/2019
  Time: 11:11 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Login</h1>
<form:form action="/login" method="post" modelAttribute="login">
    <label>Login</label>
    <input type="text" name="account">
    <label>Password</label>
    <input type="password" name="password">
    <input type="submit" value="Login">
</form:form>
</body>
</html>
