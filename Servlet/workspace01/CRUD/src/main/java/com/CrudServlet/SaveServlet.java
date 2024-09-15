package com.CrudServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		String country=req.getParameter("city");
		Emp e=new Emp();
		e.setId(id);
		e.setName(name);
		e.setPassword(password);
		e.setEmail(email);
		e.setCity(country);
		int status=EmpDao.save(e);
		if(status>0) {
			out.print("<p>Record saved Successfully</p>");
			req.getRequestDispatcher("index.html").include(req, res);
		}
		else {
			out.print("Sorry! unable to save record");
		}
		out.close();
	}
}
