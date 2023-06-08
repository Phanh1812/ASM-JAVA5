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

<form action="/khach-hang/them" method="post" class="container">

    <div class="mb-3">
        <label class="form-label">Mã</label>
        <input type="text" class="form-control" name="ma">
    </div>

    <div class="mb-3">
        <label class="form-label">Tên</label>
        <input type="text" class="form-control" name="ten">
    </div>

    <div class="mb-3">
        <label class="form-label">Tên đệm</label>
        <input type="text" class="form-control" name="tenDem">
    </div>

    <div class="mb-3">
        <label class="form-label">Họ</label>
        <input type="text" class="form-control" name="ho">
    </div>

    <div class="mb-3">
        <label class="form-label">Ngày sinh</label>
        <input type="text" class="form-control" name="ngaySinh">
    </div>

    <div class="mb-3">
        <label class="form-label">Sdt</label>
        <input type="text" class="form-control" name="sdt">
    </div>

    <div class="mb-3">
        <label class="form-label">Địa chỉ</label>
        <input type="text" class="form-control" name="diaChi">
    </div>

    <div class="mb-3">
        <label class="form-label">Thành phố</label>
        <input type="text" class="form-control" name="thanhPho">
    </div>

    <div class="mb-3">
        <label class="form-label">Quốc gia</label>
        <input type="text" class="form-control" name="quocGia">
    </div>


    <div class="mb-3">
        <label class="form-label">Mật khẩu</label>
        <input type="text" class="form-control" name="matKhau">
    </div>

    <button type="submit" class="btn btn-primary">Thêm</button>
</form>
<h2 style="align: center">Danh sách khách hàng</h2>
<table class="table">
    <thead>
    <tr>
        <td>ID</td>
        <td>Mã</td>
        <td>Tên</td>
        <td>Tên đệm</td>
        <td>Họ</td>
        <td>Ngày Sinh</td>
        <td>Sdt</td>
        <td>Địa Chỉ</td>
        <td>Thành Phố</td>
        <td>Quốc Gia</td>
        <td>Mật Khẩu</td>
        <td>Action</td>
    </tr>
    </thead>
    <tbdoy>
        <c:forEach items="${listKhachHang}" var="khachHang">
            <tr>
                <td>${khachHang.id}</td>
                <td>${khachHang.ma}</td>
                <td>${khachHang.ten}</td>
                <td>${khachHang.tenDem}</td>
                <td>${khachHang.ho}</td>
                <td>${khachHang.ngaySinh} </td>
                <td>${khachHang.sdt}</td>
                <td>${khachHang.diaChi}</td>
                <td>${khachHang.thanhPho}</td>
                <td>${khachHang.quocGia}</td>
                <td>${khachHang.matKhau}</td>
                <td>
                    <a href="/khach-hang/xoa?id=${khachHang.id}" class="btn btn-primary">Xoa</a>
                        <%--                    <a class="btn btn-primary" href="#">Update</a>--%>
                    <a class="btn btn-primary" href="/khach-hang/detail/${khachHang.id}">Detail</a>
                </td>
            </tr>
        </c:forEach>
    </tbdoy>
</table>
</body>
</html>
