/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dimas.maryanto.universitas.controller;

import com.dimas.maryanto.universitas.dao.KelasDao;
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
@WebServlet(urlPatterns = {"/kelas/delete"})
public class KelasDeleteController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer idKelas = Integer.valueOf(req.getParameter("kelasId"));
        KelasDao kelasDao = new KelasDao();
        kelasDao.hapusDataById(idKelas);
        resp.sendRedirect(req.getServletContext().getContextPath() + "/kelas/list");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer idKelas = Integer.valueOf(req.getParameter("kelasId"));
        KelasDao kelasDao = new KelasDao();
        kelasDao.hapusDataById(idKelas);
        resp.sendRedirect(req.getServletContext().getContextPath() + "/kelas/list");
    }

}
