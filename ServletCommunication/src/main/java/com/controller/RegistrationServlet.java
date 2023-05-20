package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer age = Integer.parseInt(request.getParameter("age"));
		String name = request.getParameter("name");
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		if(age<18 || age>30) {
			response.sendError(504, name+" is not eligible for Recruitment..");
		}else {
			out.println("<h1>"+name+" is eligible for Recruitment..</h1>");
		}
	}

}
