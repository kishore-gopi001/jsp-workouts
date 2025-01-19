package com.kisho;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SecondServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//int k=  Integer.parseInt(req.getParameter("k"));
		/*
		 * HttpSession session = req.getSession(); int k = (int)
		 * session.getAttribute("k");
		 */
		int k =0;
		Cookie c [] = req.getCookies();
		for(Cookie c1 : c) {
			if(c1.getName().equals("k")) k = (Integer.parseInt(c1.getValue()));
		}
		 k *= k;
		PrintWriter out = res.getWriter();
		out.println("<h1>result is </h1>"+ k);
		
		
	        ServletContext sc = getServletContext();
	        String str = sc.getInitParameter("name");
	        out.println(str);
	        System.out.println(str);
	        
	        ServletConfig cg = getServletConfig();
	        String str1 = cg.getInitParameter("name");
	        out.println(str1);
	        System.out.println(str1);
	}
}
