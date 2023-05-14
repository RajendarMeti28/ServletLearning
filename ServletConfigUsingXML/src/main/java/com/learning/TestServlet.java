package com.learning;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	static {
		System.out.println("loading TestServlet");
	}
	
    public TestServlet() {
       System.out.println("TestServlet Instantiation..");
    }
    
    public void init() {
    	System.out.println("TestServlet Initiation..");
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<table align='center' border='1'>");
		out.println("<tr><th>ParameterName</th><th>ParameterValue</th></tr>");
		
		
		Enumeration<String> parameters = config.getInitParameterNames();
		
		
		//parameter data which is static..
		while(parameters.hasMoreElements()) {
			String parameterName = parameters.nextElement();
			String parameterValue = config.getInitParameter(parameterName);
			
			out.println("<tr>");
			out.println("<td>"+parameterName+"</td><td>"+parameterValue+"</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		out.println("</body></html>");
	}

}
