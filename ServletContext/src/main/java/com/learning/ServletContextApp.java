package com.learning;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextApp
 */
@WebServlet("/test")
public class ServletContextApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletContextApp() {
        super();
      
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		
		
		//attribute data which is dynamic..
		context.setAttribute("rajendar","tyler");
		context.setAttribute("tyler","durden");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<table align='center' border='1'>");
		out.println("<tr><th>ParameterName</th><th>ParameterValue</th></tr>");
		
		
		Enumeration<String> parameters = context.getInitParameterNames();
		
		
		//parameter data which is static..
		while(parameters.hasMoreElements()) {
			String parameterName = parameters.nextElement();
			String parameterValue = context.getInitParameter(parameterName);
			
			out.println("<tr>");
			out.println("<td>"+parameterName+"</td><td>"+parameterValue+"</td>");
			out.println("</tr>");
		}
		
		out.println("<tr><th>AttributeName</th><th>AttributeValue</th></tr>");
		
		Enumeration<String> attributes = context.getAttributeNames();
		
		while(attributes.hasMoreElements()) {
			String attributeName = (String)attributes.nextElement();
			Object attributeValue = context.getAttribute(attributeName);
			
			out.println("<tr>");
			out.println("<td>"+attributeName+"</td><td>"+attributeValue+"</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		out.println("</body></html>");
	}

}
