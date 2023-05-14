package com.Trial1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Rajendar")
public class DemoServlet extends HttpServlet {
	public void init() {
		
	}
	public void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("controll is coming to servlet");
		response.setContentType("text/html");
		try {
			PrintWriter pw = response.getWriter();
			pw.println("control came to servlet and this is response from servlet");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void destroy() {
		
	}

}
