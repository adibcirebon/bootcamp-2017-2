package com.dimas.maryanto.universitas.controller;

import com.dimas.maryanto.universitas.dao.MahasiswaDao;
import com.dimas.maryanto.universitas.model.Mahasiswa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/mahasiswa/list"})
public class MahasiswaListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        MahasiswaDao mahasiswaDao = new MahasiswaDao();
        List<Mahasiswa> listMahasiswa = mahasiswaDao.semuaDataMahasiswa();
        int jumlahMahasiswa = listMahasiswa.size();
        req.setAttribute("listMahasiswa", listMahasiswa);
        req.setAttribute("jumlahMahasiswa", jumlahMahasiswa);

        req.getRequestDispatcher("/pages/mahasiswa/index.jsp")
                .forward(req, resp);
    }
}
