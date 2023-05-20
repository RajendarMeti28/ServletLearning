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
@WebServlet("/test3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("City", city);
		session.setAttribute("State",state);
		
		//retrieve data from session object..
		
		String name = (String) session.getAttribute("Name");
		String age = (String) session.getAttribute("Age");
		String profession = (String) session.getAttribute("Profession");
		String qualification = (String) session.getAttribute("Qualification");
		String ucity = (String) session.getAttribute("City");
		String ustate = (String) session.getAttribute("State");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<body><center>");
		out.println("<table border=1, bgColor='cyan'>");
		
		out.println("<tr><th>Name</th><td>"+name+"</td>");
		out.println("<tr><th>Age</th><td>"+age+"</td>");
		out.println("<tr><th>Profession</th><td>"+profession+"</td>");
		out.println("<tr><th>Qualification</th><td>"+qualification+"</td>");
		out.println("<tr><th>City</th><td>"+ucity+"</td>");
		out.println("<tr><th>State</th><td>"+ustate+"</td>");
		
		out.println("</table></center></body>");
		
		
		out.close();
		
	}

}
