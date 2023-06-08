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

<form action="/gio-hang/them" method="post" class="container">

<%--    <select id="khachHang" name="khachHang">--%>
<%--        <option value="">Tên khách hàng</option>--%>
<%--        <!-- Loop through the sanPhamList and generate options -->--%>
<%--        <c:forEach items="${khachHang}" var="khachHang">--%>
<%--            <option value="${khachHang}">${khachHang.id}</option>--%>
<%--        </c:forEach>--%>
<%--    </select>--%>
    <select id="khachHang" name="khachHang">
        <option value="">Tên khách hàng</option>
        <!-- Loop through the sanPhamList and generate options -->
        <c:forEach items="${khachHang}" var="khachHang">
            <option value="${khachHang.id}">${khachHang.ten}</option>
        </c:forEach>
    </select>

    <select id="nhanVien" name="nhanVien">
        <option value="">Tên nhân viên</option>
        <!-- Loop through the sanPhamList and generate options -->
        <c:forEach items="${nhanVien}" var="nhanVien">
            <option value="${nhanVien.id}">${nhanVien.ten}</option>
        </c:forEach>
    </select>



<%--    <select id="nhanVien" name="nhanVien">--%>
<%--        <option value="">Tên nhân viên</option>--%>
<%--        <!-- Loop through the sanPhamList and generate options -->--%>
<%--        <c:forEach items="${nhanVien}" var="nhanVien">--%>
<%--            <option value="${nhanVien}">${nhanVien.id}</option>--%>
<%--        </c:forEach>--%>
<%--    </select>--%>

    <div class="mb-3">
        <label class="form-label">Mã</label>
        <input type="text" class="form-control" name="ma">
    </div>

    <div class="mb-3">
        <label class="form-label">Ngày tạo</label>
        <input type="date" class="form-control" name="ngayTao">
    </div>

    <div class="mb-3">
        <label class="form-label">Ngày thanh toán</label>
        <input type="date" class="form-control" name="ngaythanhToan">
    </div>

    <div class="mb-3">
        <label class="form-label">Tên người nhận</label>
        <input type="text" class="form-control" name="tennguoiNhan">
    </div>

    <div class="mb-3">
        <label class="form-label">Địa chỉ</label>
        <input type="text" class="form-control" name="diaChi">
    </div>

    <div class="mb-3">
        <label class="form-label">Sdt</label>
        <input type="text" class="form-control" name="sdt">
    </div>

    <div class="col-6">
        <label>Tình Trạng </label>
        <select name="tinhTrang" class="form-select">
            <option  value="1">Đã Nhận Hàng </option>
            <option value="0">Chưa Nhận Hàng </option>
        </select>
    </div>

    <button type="submit" class="btn btn-primary">Thêm</button>
</form>


<h2 style="align: center">Giỏ hàng</h2>
<table class="table">
    <thead>
    <tr>
        <td>ID</td>
        <td>Tên khách hàng</td>
        <td>Tên nhân viên</td>
        <td>Mã</td>
        <td>Ngày tạo</td>
        <td>Ngày thanh toán</td>
        <td>Tên người nhận</td>
        <td>Địa chỉ</td>
        <td>Sdt</td>
        <td>Tình trạng</td>
        <td>Action</td>
    </tr>
    </thead>
    <tbdoy>
        <c:forEach items="${listGH}" var="gioHang">
            <tr>
                <td>${gioHang.id}</td>
                <td>${gioHang.khachHang.ma}</td>
                <td>${gioHang.nhanVien.ma}</td>
                <td>${gioHang.ma}</td>
                <td>${gioHang.ngayTao}</td>
                <td>${gioHang.ngaythanhToan}</td>
                <td>${gioHang.tennguoiNhan}</td>
                <td>${gioHang.diaChi}</td>
                <td>${gioHang.sdt}</td>
                <td>${gioHang.tinhTrang}</td>

                <td>
                    <a href="/gio-hang/xoa?id=${gioHang.id}" class="btn btn-primary">Xoa</a>
                        <%--                    <a class="btn btn-primary" href="#">Update</a>--%>
                    <a class="btn btn-primary" href="/gio-hang/detail/${gioHang.id}">Detail</a>
                </td>
            </tr>
        </c:forEach>
    </tbdoy>
</table>
</body>
</html>
