<%--
  Created by IntelliJ IDEA.
  User: nguyenvv4
  Date: 22/01/2023
  Time: 11:31
  To change this template use File | Settings | File Templates.
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<h2 style="align: center">Danh sách nhà sản xuất</h2>
<table class="table">
    <thead>
    <tr>
        <td>ID</td>
        <td>Mã</td>
        <td>Id KH</td>
        <td>Id NV</td>
        <td>Ngày Tạo</td>
        <td>Ngày Thanh Toán</td>
        <td>Ngày Ship</td>
        <td>Ngày Nhận</td>
        <td>Tình Trạng</td>
        <td>Tên Người Nhận</td>
        <td>Địa Chỉ</td>
        <td>SDT</td>
        <td></td>
    </tr>
    </thead>
    <tbdoy>
        <c:forEach items="${listHoaDon}" var="hoaDon">
            <tr>
                <td>${hoaDon.id}</td>
                <td>${hoaDon.ma}</td>
                <td>${hoaDon.khachHang.ten}</td>
                <td>${hoaDon.nhanVien.ten}</td>
                <td>${hoaDon.ngayTao}</td>
                <td>${hoaDon.ngaythanhToan}</td>
                <td>${hoaDon.ngayShip}</td>
                <td>${hoaDon.ngayNhan}</td>
                <td>${hoaDon.tinhTrang}</td>
                <td>${hoaDon.tennguoiNhan}</td>
                <td>${hoaDon.diaChi}</td>
                <td>${hoaDon.sdt}</td>
                <td>
                    <a href="#" class="btn btn-primary">Xoa</a>
                        <%--                    <a class="btn btn-primary" href="#">Update</a>--%>
                    <a class="btn btn-primary" href="#">Detail</a>
                </td>
            </tr>
        </c:forEach>
    </tbdoy>
</table>
</body>
</html>
