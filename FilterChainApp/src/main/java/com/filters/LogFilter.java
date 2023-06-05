package com.filters;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class LogFilter
 */
@WebFilter("/test")
public class LogFilter extends HttpFilter implements Filter {
       
   private FilterConfig config;
   
   static {
	   System.out.println("Log Filter loading...");
   }
    public LogFilter() {
    	System.out.println("Log Filter Instantiation...");
    }

	public void destroy() {
		System.out.println("Log Filter De-Instantiation...");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		ServletContext context = config.getServletContext();
		context.log("A request is incoming from "+request.getRemoteAddr()+"at "+new Date());
		

		PrintWriter out = response.getWriter();
		
		out.println("<h1>This is from Log Filter before Pre Processing..");
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		out.println("<h1>This is from Log Filter after Pre Processing..");
	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Log Filter Initialization...");
		this.config = fConfig;
	}

}
