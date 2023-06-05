package com.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class LogFilter
 */
@WebFilter("/test")
public class DemoFilter extends HttpFilter implements Filter {
       

	static {
		System.out.println("Demo Filter Loading...");
	}
    public DemoFilter() {
    	System.out.println("Demo Filter Instantiation...");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		

		PrintWriter out = response.getWriter();

		out.println("<h1>This is from Demo Filter before Pre Processing..");
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	
		out.println("<h1>This is from Demo Filter after Pre Processing..");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Demo Filter Initialization...");
	}

}
