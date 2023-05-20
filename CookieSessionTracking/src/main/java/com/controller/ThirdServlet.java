package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/test3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		
		Cookie[] cookies =  request.getCookies();
		String name = cookies[0].getValue();
		String age = cookies[1].getValue();
		String profession = cookies[2].getValue();
		String qualification = cookies[3].getValue();
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<body bgColor='pink'><center>");
		out.println("<table border=1, bgColor='cyan'>");
		
		out.println("<tr><th>Name</th><td>"+name+"</td>");
		out.println("<tr><th>Age</th><td>"+age+"</td>");
		out.println("<tr><th>Profession</th><td>"+profession+"</td>");
		out.println("<tr><th>Qualification</th><td>"+qualification+"</td>");
		out.println("<tr><th>City</th><td>"+city+"</td>");
		out.println("<tr><th>State</th><td>"+state+"</td>");
		
		out.println("</table></center></body>");
		
		
		out.close();
	}

}
