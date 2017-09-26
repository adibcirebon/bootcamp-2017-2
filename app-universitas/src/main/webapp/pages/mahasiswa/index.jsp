<%--
  Created by IntelliJ IDEA.
  User: dimmaryanto93
  Date: 26/09/17
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Daftar Mahasiswa</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <td>Kode</td>
        <td>NIM</td>
        <td>Nama Mahasiswa</td>
        <td>Kelas</td>
        <td>Jurusan</td>
        <td>Aksi</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listMahasiswa}" var="mhs">
        <tr>
            <td>${mhs.id}</td>
            <td>${mhs.nim}</td>
            <td>${mhs.nama}</td>
            <td>${mhs.kelas.nama}</td>
            <td>${mhs.jurusan.nama}</td>
            <td></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
