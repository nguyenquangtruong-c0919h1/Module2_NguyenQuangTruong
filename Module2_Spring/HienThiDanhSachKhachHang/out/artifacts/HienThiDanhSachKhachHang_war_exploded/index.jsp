<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 23/11/2019
  Time: 1:53 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$DanhSachKhachHang$</title>
  </head>
  <body>
  <div>
    <table border="1" cellpadding="5">
      <caption>Danh Sach Khach Hang</caption>
      <tr>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa Chỉ</th>
        <th>Ảnh</th>
      </tr>
      <c:forEach var="customer" items="${listCustomer}">
        <tr>
          <td>${customer.getName()}</td>
          <td>${customer.getBirthday()}</td>
          <td>${customer.getAddress()}</td>
          <td>${customer.getPicture()}</td>
        </tr>
      </c:forEach>
    </table>
  </div>
  </body>
</html>
