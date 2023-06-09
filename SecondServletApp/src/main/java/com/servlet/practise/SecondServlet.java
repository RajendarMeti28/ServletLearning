package com.servlet.practise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/test")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	static {
		System.out.println("Servlet loading...");
	}
	
    public SecondServlet() {
        System.out.println("Servlet initialization");
    }
   
    
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Request method is GET");
		
		//set the response type..
		response.setContentType("text/html");
		
		//2: Getting the PrintWriter object to send the response.
		PrintWriter out = response.getWriter();
		
		//3:Setting the html page to write the response.
		out.println("<html><html>");
		out.println("<body>");
		out.println("<h1>Getting the response for GET request type</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("Request method is POST");
		
	System.out.println("Request method is GET");
		
		//set the response type..
		response.setContentType("text/html");
		
		//2: Getting the PrintWriter object to send the response.
		PrintWriter out = response.getWriter();
		
		//3:Setting the html page to write the response.
		out.println("<html><html>");
		out.println("<body>");
		out.println("<h1>Getting the response for POST request type</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
