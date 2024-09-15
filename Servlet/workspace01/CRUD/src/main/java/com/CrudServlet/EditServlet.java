package com.CrudServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>Update Employee</h1>");
		String sid = req.getParameter("id"); 
		int id=Integer.parseInt(sid);
		Emp e=EmpDao.getEmployeeById(id);
		out.print("<form action='EditServlet2' method='post'>");
		out.print("<table>");
		out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");
		out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td></tr>");
		out.print("<tr><td>Password:</td><td><input type='password' name='password' value='"+e.getPassword()+"'/></td></tr>");
		out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>");
		out.print("<tr><td>City:</td><td>");
		out.print("<select name='city' style='width:150px'>");
		out.print("<option>Thanjavur</option>");
		out.print("<option>Chennai</option>");
		out.print("<option>Trichy</option>");
		out.print("<option>Coimbatore</option>");
		out.print("<option>others</option>");
		
		out.print("</select>");
		out.print("</td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save'/></td></tr>");
		out.print("</table>");
		out.print("</form>");
		out.close();

	}

}
