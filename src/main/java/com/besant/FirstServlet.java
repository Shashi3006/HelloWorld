package com.besant;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

public class FirstServlet extends HttpServlet
{
 @Override
 public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
 {
	 String name = req.getParameter("fn");
	 String lname = req.getParameter("ln");
	 String uid = req.getParameter("ui");
	 PrintWriter out = resp.getWriter();
	 out.println("<h1>Hello "+name+"</h1>");
	 out.println("<h2>Your Fullname : "+name+" "+lname+"</h2>");
	 out.println("<h2>UserId: "+uid+"</h2>");
 }
}