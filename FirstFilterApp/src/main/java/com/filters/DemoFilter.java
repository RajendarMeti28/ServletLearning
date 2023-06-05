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
 * Servlet Filter implementation class DemoFilter
 */
@WebFilter("/test")
public class DemoFilter extends HttpFilter implements Filter {

	static {
		 System.out.println("Filter is Loading...");
	}
	
    public DemoFilter() {
        System.out.println("Filter is instantiated...");
    }
    
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter Initialization...");
	}

	public void destroy() {
		System.out.println("Filter De-Initialization");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1>This came from Demo Filter before processing..");
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		out.println("<h1>This came from Demo Filter after processing..");
	}

}
