package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<body bgColor='cyan'>");
		out.println("<center>");
		out.println("<form method='get' action='./second'>");
		out.println("<input type='hidden' name='name' value='"+ name +"'/>");
		out.println("<input type='hidden' name='age' value='"+ age +"'/>");
		out.println("<table>");
		out.println("<tr><th>Email</th><td><input type='text' name='email'/></td></tr>");
		out.println("<tr><th></th><td><input type='submit' value='submit'/></td></tr>");
		
		out.println("</table></form></center></body>");
	}

}
