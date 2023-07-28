package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ser extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h2 style='color:blue;'>Welcome to Servlet2</h2>");
		
		String name=request.getParameter("user");
		
		out.println("<h2 style='color:red;'>Welcome back "+name+" </h2>");
	}

}
