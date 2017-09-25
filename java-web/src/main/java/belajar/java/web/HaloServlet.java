/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dimmaryanto93
 */
//@WebServlet(urlPatterns = {"/halo-servlet"}, name = "halo-servlet")
public class HaloServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        String username = req.getParameter("user");
        resp.getWriter().append("<html>"
                + "<head>"
                + " <title>Belajar Servlet</title>"
                + "</head>"
                + "<body>"
                + " <p>Ini dari servlet dengan parameter user bernilai "+username+"</p>"
                        + "</body>"
                        + "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String username = req.getParameter("username");
         String password = req.getParameter("passwd");
         String htmlElement = "<html>"
                + "<head>"
                + " <title>Belajar Servlet</title>"
                + "</head>"
                + "<body>"
                + " <p>Ini dari servlet dengan parameter user bernilai "+username+" dan passwordnya adalah "+password+"</p>"
                        + "</body>"
                        + "</html>";
        resp.getWriter().append(htmlElement);
        System.out.println(htmlElement);
        
    }
    
    
    
    
    
}
