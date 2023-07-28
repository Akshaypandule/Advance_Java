package com.parameter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		out.println("<h3>Hello ,"+name+" Welcome to my website </h3>");
		
		out.println("<h3><a href='servlet2'> go to servlet 2</a></h3>");
		// Create cookie
		Cookie co=new Cookie("user_name", name);
		response.addCookie(co);
	}

}
