package com.CrudServlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String city = req.getParameter("city");
        
        Emp e = new Emp();
        e.setId(id);
        e.setName(name);
        e.setPassword(password);
        e.setEmail(email);
        e.setCity(city);
        
//        System.out.println("ID: " + id);
//        System.out.println("Name: " + name);
//        System.out.println("Password: " + password);
//        System.out.println("Email: " + email);
//        System.out.println("City: " + city);

        
        int status = EmpDao.update(e);
        if (status > 0) {
            res.sendRedirect("ViewServlet");
        } else {
            res.getWriter().println("Sorry! Unable to update record");
        }
    }
}
