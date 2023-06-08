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
<h2 style="align: center">Danh sách khách hàng</h2>
<form action="/khach-hang/update/${khachHang.id}" method="post" class="container">

    <div class="mb-3">
        <label class="form-label">Mã</label>
        <input type="text" class="form-control" name="ma" value="${khachHang.ma}">
    </div>

    <div class="mb-3">
        <label class="form-label">Tên</label>
        <input type="text" class="form-control" name="ten" value="${khachHang.ten}">
    </div>

    <div class="mb-3">
        <label class="form-label">Tên đệm</label>
        <input type="text" class="form-control" name="tenDem" value="${khachHang.tenDem}">
    </div>

    <div class="mb-3">
        <label class="form-label">Họ</label>
        <input type="text" class="form-control" name="ho" value="${khachHang.ho}">
    </div>

    <div class="mb-3">
        <label class="form-label">Ngày sinh</label>
        <input type="text" class="form-control" name="ngaySinh" value="${khachHang.ngaySinh}">
    </div>

    <div class="mb-3">
        <label class="form-label">Sdt</label>
        <input type="text" class="form-control" name="sdt" value="${khachHang.sdt}">
    </div>

    <div class="mb-3">
        <label class="form-label">Địa chỉ</label>
        <input type="text" class="form-control" name="diaChi" value="${khachHang.diaChi}">
    </div>

    <div class="mb-3">
        <label class="form-label">Thành phố</label>
        <input type="text" class="form-control" name="thanhPho" value="${khachHang.thanhPho}">
    </div>

    <div class="mb-3">
        <label class="form-label">Quốc gia</label>
        <input type="text" class="form-control" name="quocGia" value="${khachHang.quocGia}">
    </div>


    <div class="mb-3">
        <label class="form-label">Mật khẩu</label>
        <input type="text" class="form-control" name="matKhau" value="${khachHang.matKhau}">
    </div>

    <button type="submit" class="btn btn-primary">Update</button>
</form>
</body>
</html>
