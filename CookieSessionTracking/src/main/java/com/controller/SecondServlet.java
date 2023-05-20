package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String qualification = request.getParameter("qual");
		String profession = request.getParameter("prof");
		
		Cookie c1 = new Cookie("qualification",qualification);
		Cookie c2 = new Cookie("profession",profession);
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		RequestDispatcher rd = request.getRequestDispatcher("form3.html");
		rd.forward(request, response);
	}

}
