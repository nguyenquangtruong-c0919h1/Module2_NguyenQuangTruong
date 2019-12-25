<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 23/11/2019
  Time: 10:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form method="post" action="/calculator">
    <h2>Calculator</h2>
    <label>First Operand</label>
    <input type="text" name="firstOperand" placeholder="First Operand"></br>
    <label>Operator</label>
    <select name="operator">
        <option value="+"> +</option>
        <option value="-"> -</option>
        <option value="*"> *</option>
        <option value="/"> /</option>
    </select></br>
    <label>Second Operand</label>
    <input type="text" name="secondOperand" placeholder="Second Operand"></br>
    <input type="button" id="calculator" value="Calculater">
</form>
</body>
</html>
