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
<h2 style="align: center">Danh sách chi tiết sản phẩm</h2>

<form action="/chi-tiet-san-pham/update/${ctsp.id}" method="post" class="container">

    <select id="sanPham" name="sanPham">
        <option value="">Select...</option>
        <!-- Loop through the sanPhamList and generate options -->
        <c:forEach items="${sanPham}" var="sanPham">
            <option value="${sanPham.id}">${sanPham.ten}</option>
        </c:forEach>
    </select>

    <select id="nxs" name="nxs">
        <option value="">Select...</option>
        <!-- Loop through the sanPhamList and generate options -->
        <c:forEach items="${nxs}" var="nxs">
            <option value="${nxs.id}">${nxs.ten}</option>
        </c:forEach>
    </select>

    <select id="mauSac" name="mauSac">
        <option value="">Select...</option>
        <!-- Loop through the sanPhamList and generate options -->
        <c:forEach items="${mauSac}" var="mauSac">
            <option value="${mauSac.id}">${mauSac.ten}</option>
        </c:forEach>
    </select>

    <select id="dongSP" name="dongSP">
        <option value="">Select...</option>
        <!-- Loop through the sanPhamList and generate options -->
        <c:forEach items="${dongSP}" var="dongSP">
            <option value="${dongSP.id}">${dongSP.ten}</option>
        </c:forEach>

    </select>

    <div class="mb-3">
        <label class="form-label">Năm bảo hành</label>
        <input type="text" class="form-control" name="namBH" value="${ctsp.namBH}">
    </div>

    <div class="mb-3">
        <label class="form-label">Mô tả</label>
        <input type="text" class="form-control" name="moTa" value="${ctsp.moTa}">
    </div>

    <div class="mb-3">
        <label class="form-label">Số lượng tồn</label>
        <input type="text" class="form-control" name="soluongTon" value="${ctsp.soluongTon}">
    </div>

    <div class="mb-3">
        <label class="form-label">Giá nhập</label>
        <input type="text" class="form-control" name="giaNhap" value="${ctsp.giaNhap}">
    </div>

    <div class="mb-3">
        <label class="form-label">Giá bán</label>
        <input type="text" class="form-control" name="giaBan" value="${ctsp.giaBan}">
    </div>

    <button type="submit" class="btn btn-primary">Thêm</button>
</form>
</body>
</html>
