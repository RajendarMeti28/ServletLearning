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
@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<body bgColor='light-green'>");
		out.println("<center><table border=1, bgColor='cyan'>");
		out.println("<tr><th>Name</th><td>"+ name +"</td></tr>");
		out.println("<tr><th>Age</th><td>"+ age +"</td></tr>");
		out.println("<tr><th>Email</th><td>"+ email +"</tr>");
		out.println("<tr><th>Mobile</th><td>" + mobile +"</td></tr>");
		
		out.println("</form></table></center></body>");

	}

}
