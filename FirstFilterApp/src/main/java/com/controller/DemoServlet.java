package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/test")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {

        System.out.println("Demo Servlet Loading..");
	}
    public DemoServlet() {
        System.out.println("Demo Servlet Instantiation..");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {

        System.out.println("Demo Servlet Initialization..");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {

        System.out.println("Demo Servlet De-Instantiation..");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h2>This came from Demo Servlet</h2>");
	}

}
