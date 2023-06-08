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
<h2 style="align: center">Giỏ hàng</h2>

<form action="/gio-hang/update/${gioHang.id}" method="post" class="container">

    <select id="khachHang" name="khachHang">
        <option value="">Select...</option>
        <!-- Loop through the sanPhamList and generate options -->
        <c:forEach items="${khachHang}" var="khachHang">
            <option value="${khachHang.id}">${khachHang.ten}</option>
        </c:forEach>
    </select>

    <select id="nhanVien" name="nhanVien">
        <option value="">Select...</option>
        <!-- Loop through the sanPhamList and generate options -->
        <c:forEach items="${nhanVien}" var="nhanVien">
            <option value="${nhanVien.id}">${nhanVien.ten}</option>
        </c:forEach>
    </select>

    <div class="mb-3">
        <label class="form-label">Mã</label>
        <input type="text" class="form-control" name="ma" value="${gioHang.ma}">
    </div>

    <div class="mb-3">
        <label class="form-label">Ngày tạo</label>
        <input type="text" class="form-control" name="ngayTao" value="${gioHang.ngayTao}">
    </div>

    <div class="mb-3">
        <label class="form-label">Ngày thanh toán</label>
        <input type="text" class="form-control" name="ngayThanhToan" value="${gioHang.ngaythanhToan}">
    </div>

    <div class="mb-3">
        <label class="form-label">Tên người nhận</label>
        <input type="text" class="form-control" name="tennguoiNhan" value="${gioHang.tennguoiNhan}">
    </div>

    <div class="mb-3">
        <label class="form-label">Địa chỉ</label>
        <input type="text" class="form-control" name="diaChi" value="${gioHang.diaChi}">
    </div>

    <div class="mb-3">
        <label class="form-label">Sdt</label>
        <input type="text" class="form-control" name="sdt" value="${gioHang.sdt}">
    </div>

    <div class="mb-3">
        <label class="form-label">Tình trạng</label>
        <input type="text" class="form-control" name="tinhTrang" value="${gioHang.tinhTrang}">
    </div>

    <button type="submit" class="btn btn-primary">Update</button>
</form>
</body>
</html>
