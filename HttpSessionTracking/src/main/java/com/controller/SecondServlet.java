package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String qual = request.getParameter("qual");
		String prof = request.getParameter("prof");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("Qualification", qual);
		session.setAttribute("Profession",prof);
		
		RequestDispatcher rd = request.getRequestDispatcher("form3.html");
		
		rd.forward(request, response);
		
	}

}
