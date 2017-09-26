package com.dimas.maryanto.universitas.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.dimas.maryanto.universitas.dao.MahasiswaDao;
import com.dimas.maryanto.universitas.model.Mahasiswa;

@WebServlet(urlPatterns = {"/mahasiswa/list"})
public class MahasiswaListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        MahasiswaDao mahasiswaDao = new MahasiswaDao();
        List<Mahasiswa> listMahasiswa = mahasiswaDao.semuaDataMahasiswa();
        req.setAttribute("listMahasiswa", listMahasiswa);

        req.getRequestDispatcher("/pages/mahasiswa/index.jsp").forward(req, resp);
    }
}
