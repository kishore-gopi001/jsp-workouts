package com.kisho;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



 @SuppressWarnings("serial")


public class demoServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		  Helper s = new Helper(1,"kishore"); 
		  request.setAttribute("student", s);
		  RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
		   rd.forward(request, response);
		
	}

}