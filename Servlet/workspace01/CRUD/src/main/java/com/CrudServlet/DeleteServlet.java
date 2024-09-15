package com.CrudServlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		String sid=req.getParameter("id");
		int id=Integer.parseInt(sid);
		EmpDao.delete(id);
		res.sendRedirect("ViewServlet");
	}

}
