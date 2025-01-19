package com.kisho;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings({ "serial", "unused" })
public class AddServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html"); // Set response content type
        
        
        // Parse input parameters
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int k = i + j;
        //2.3 cookies creation
        Cookie cookie = new Cookie("k" ,k + "");
        res.addCookie(cookie);
        res.sendRedirect("sq");
        //2.2.session management
        //HttpSession session = req.getSession();
        //session.setAttribute("k", k);
      
        // redirect for intercommunication between servlet.
       // 2.1(URL rewriting)res.sendRedirect("sq?k=" +k);
        // 1.request dispatcher for "communicaton between servlet in same website"
		/*
		 * req.setAttribute("k", k); RequestDispatcher rd =
		 * req.getRequestDispatcher("sq"); rd.forward(req,res);
		 */
       
        
    }
}
