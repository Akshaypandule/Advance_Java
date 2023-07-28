package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Myservlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		
		System.out.println("This is get method");
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();	
		out.println("<h1> This get Method by Servlet<h1>");
		out.println(new Date().toString());
	}

}
