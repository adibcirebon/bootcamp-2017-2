package com.dimas.maryanto.universitas.controller;

import com.dimas.maryanto.universitas.dao.JurusanDao;
import com.dimas.maryanto.universitas.dao.KelasDao;
import com.dimas.maryanto.universitas.dao.MahasiswaDao;
import com.dimas.maryanto.universitas.model.Jurusan;
import com.dimas.maryanto.universitas.model.Kelas;
import com.dimas.maryanto.universitas.model.Mahasiswa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/mahasiswa/new", "/mahasiswa/add/proses"})
public class MahasiswaAddController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        KelasDao kelasDao = new KelasDao();
        List<Kelas> listKelas = kelasDao.semuaDataKelas();

        JurusanDao jurusanDao = new JurusanDao();
        List<Jurusan> listJurusan = jurusanDao.ambilSemuaData();

        req.setAttribute("listKelas", listKelas);
        req.setAttribute("listJurusan", listJurusan);

        req.getRequestDispatcher("/pages/mahasiswa/addMahasiswa.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        Mahasiswa mhs = new Mahasiswa();
        Kelas kelas = new Kelas();
        Jurusan jurusan = new Jurusan();

        mhs.setNim(req.getParameter("nimMahasiswa"));
        mhs.setNama(req.getParameter("namaMahasiswa"));

        kelas.setId(Integer.valueOf(req.getParameter("kelasMahasiswa")));
        jurusan.setId(Integer.valueOf(req.getParameter("jurusanMahasiswa")));

        mhs.setJurusan(jurusan);
        mhs.setKelas(kelas);

        System.out.println("object mhs { nama: " + mhs.getNama() + ", nim: " +
                mhs.getNim() + ", kelas.id: " +
                mhs.getKelas().getId() +
                ", jurusan.id: " + mhs.getJurusan().getId() + "}");

        MahasiswaDao mahasiswaDao = new MahasiswaDao();
        mahasiswaDao.simpanMahasiswa(mhs);

        resp.sendRedirect(req.getServletContext().getContextPath() + "/mahasiswa/list");

    }
}
