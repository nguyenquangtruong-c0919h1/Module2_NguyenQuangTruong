<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 22/11/2019
  Time: 10:04 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <style type="text/css">
    .login{
      height: 180px;width: 230px;
      margin: 0;
      padding: 10px;
        border: 1px #CCC solid;
    }
    .login input{
      padding: 5px;
      margin: 5px;
    }
  </style>
  <body>
  <form method="get" action="/login">
    <div class="login">
      <h2>Login</h2>
      <input type="text" name="usename" size="20" placeholder="Use Name">
      <input type="password" name="password" size="20" placeholder="Password">
      <input type="submit" value="Sign in">
    </div>
  </form>
  </body>
</html>
