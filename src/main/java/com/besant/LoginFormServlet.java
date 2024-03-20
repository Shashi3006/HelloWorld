package com.besant;
import java.io.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;

@WebServlet("/login")
public class LoginFormServlet extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String fname = req.getParameter("fn");
		String lname = req.getParameter("ln");
		String date = req.getParameter("dob");
		String gender = req.getParameter("gender");
		String user = req.getParameter("ui");
		String password = req.getParameter("pass");
		
		PrintWriter output = resp.getWriter();
		
		output.println("<h1>Welcome "+fname);
		output.println("<h3>Fullname: "+fname+" "+lname);
		output.println("<h3>Date of Birth: "+date);
		output.println("<h3>Gender: "+gender);
		output.println("<h3>Username: "+user);
		output.println("<h3>Password: "+password);
	}
}

