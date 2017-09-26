<%--
  Created by IntelliJ IDEA.
  User: dimmaryanto93
  Date: 26/09/17
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tambah data Mahasiswa</title>
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/mahasiswa/add/proses" method="post">
    <div>
        <label for="nimMahasiswa">NIM</label>
        <input type="number" name="nimMahasiswa" id="nimMahasiswa" maxlength="8">
    </div>
    <div>
        <label for="namaMahasiswa">Nama Mahasiswa</label>
        <input type="text" name="namaMahasiswa" id="namaMahasiswa">
    </div>
    <div>
        <label for="c">Pilih Kelas</label>
        <select name="kelasMahasiswa" id="c">
            <c:forEach items="${listKelas}" var="k">
                <option value="${k.id}">${k.nama}</option>
            </c:forEach>
        </select>
    </div>
    <div>
        <label for="jurusanMahasiswa">Pilih Jurusan</label>
        <select name="jurusanMahasiswa" id="jurusanMahasiswa">
            <c:forEach items="${listJurusan}" var="jur">
                <option value="${jur.id}">${jur.nama}</option>
            </c:forEach>
        </select>
    </div>
    <div>
        <button type="submit">Kirim</button>
        <button type="reset">Reset</button>
    </div>
</form>
</body>
</html>
