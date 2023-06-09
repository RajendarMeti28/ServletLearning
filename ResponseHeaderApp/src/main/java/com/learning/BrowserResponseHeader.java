package com.learning;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BrowserResponseHeader
 */
@WebServlet(urlPatterns={"/test"}, loadOnStartup=-1)
public class BrowserResponseHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("Test Servlet loading....");
	}
	
	public BrowserResponseHeader() {
		System.out.println("TestServlet Instantiation...");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RequestProcessing for GET Requestr type...");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Output</title></head>");
		out.println("<body>");
		out.println("<h1 align='center'>Reqest Header information...</h1>");
		
		Enumeration<String> headerNames = request.getHeaderNames();
		
		out.println("<table border='1' align='center'>");
		out.println("<tr><th>HeaderName</th><th>HeaderValue></th></tr>");
		
		while(headerNames.hasMoreElements()) {
			out.println("<tr>");
			String headerName = (String) headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			out.println("<td>"+headerName+"</td><td>"+headerValue+"</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	
		
	}
	
	public void destroy() {
		System.out.println("Test Servlet De-insatantiation...");
	}

}
