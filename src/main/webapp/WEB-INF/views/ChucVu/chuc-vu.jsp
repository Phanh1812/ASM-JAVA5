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
<form action="/chuc-vu/them" method="post" class="container">

    <div class="mb-3">
        <label class="form-label">Ma</label>
        <input type="text" class="form-control" name="ma" >
    </div>
    <div class="mb-3">
        <label class="form-label">Ten</label>
        <input type="text" class="form-control" name="ten">
    </div>

    <button type="submit" class="btn btn-primary">Them</button>
</form>
<h2 style="align: center">Danh sách chức vụ</h2>
<table class="table">
    <thead>
    <tr>
        <td>ID</td>
        <td>Mã</td>
        <td>Tên</td>
        <td>Action</td>
    </tr>
    </thead>
    <tbdoy>
        <c:forEach items="${listChucVu}" var="chucVu">
            <tr>
                <td>${chucVu.id}</td>
                <td>${chucVu.ma}</td>
                <td>${chucVu.ten}</td>
                <td>
                    <a href="/chuc-vu/xoa?id=${chucVu.id}" class="btn btn-primary">Xoa</a>
                    <a href="/chuc-vu/detail/${chucVu.id}" class="btn btn-primary" >Detail</a>
                </td>
            </tr>
        </c:forEach>
    </tbdoy>
</table>
</body>
</html>
