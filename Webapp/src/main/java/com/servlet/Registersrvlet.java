        package com.servlet;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class Registersrvlet  extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h2> Welcome to Servlet<h2>");
		String name=req.getParameter("user_name");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		String condition=req.getParameter("condition");
		if(condition!=null)
		{
			if(condition.equals("checked"))
			{
			out.println("<h2> Name" +name+ "</h2");
			out.println("<h2> password "+password+ "</h2");
			out.println("<h2> Email "+email+"</h2>");
			out.println("<h2> user Gender "+gender+ " </h2>");
			out.println("<h2> course "+course+"</h2>");
			 RequestDispatcher rd=req.getRequestDispatcher("success");
			 rd.forward(req, res);
			} 
		}
		else 
		{ 
			out.println("<h2> You have not accepted term and condition ");
		}
	}
}
