/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dimas.maryanto.universitas.controller;

import com.dimas.maryanto.universitas.dao.KelasDao;
import com.dimas.maryanto.universitas.model.Kelas;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dimmaryanto93
 */
@WebServlet(urlPatterns = {"/kelas/new"})
public class KelasAddFormController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        Kelas kelasBaru = new Kelas();
        kelasBaru.setNama(req.getParameter("kelasName"));
        kelasBaru.setAngkatan(Integer.valueOf(req.getParameter("kelasAngkatan")));

        KelasDao kelasDao = new KelasDao();
        kelasDao.save(kelasBaru);
        
        System.out.println("nilai yang diambil dari form  {nama: " + kelasBaru.getNama() + ", angkatan: " + kelasBaru.getAngkatan() + "}");
    }

}
