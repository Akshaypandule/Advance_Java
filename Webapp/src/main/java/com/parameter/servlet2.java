package com.parameter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet2 extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		// Getting all cookies
		
		 Cookie[] cookies=request.getCookies();
		 boolean f=false;
		 String name="";
		 
		 if(cookies==null) {
			 
			 out.println("<h4> you are new user please go to the home page and submit your name</h4>");
			 return;
		 }
		 else
		 {
			 for(Cookie c:cookies)
			 {
				 String tname=c.getName();
				 if(tname.equals("user_name"))
				 {
					 f=true;
					 name=c.getValue();
				 }
			 }
		 }
		if(f) {
		out.println("<h2> hello,"+name+ "welcome back to my website");
		}
		else
		{
			out.println("<h3> you are new user please fill the form");
		}
	
	}

}
