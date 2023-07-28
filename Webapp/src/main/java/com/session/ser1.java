package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ser1 extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		out.println("<h3> Your name is "+name+ "</h3>");
		
		//out.println("<a href='ser?user="+name+"'> Go to Servlet2</a>");
		
		out.println(""
				+"<form action='ser'>"
				+"<input type='hidden' name='user' value='"+name+"'/>"
				+"<button>Go to servlet</button>"
				+"</frmo>"
				  );
	}

}
