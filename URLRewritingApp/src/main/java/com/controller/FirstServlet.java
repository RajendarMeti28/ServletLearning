package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accNo = request.getParameter("accNo");
		String accName = request.getParameter("accName");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("accNo", accNo);
		session.setAttribute("accName",accName);
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<body bgColor='light-green'>");
		out.println("<center><table>");
		out.println("<form method='get' action='"+  response.encodeURL("./test2")+"')");
		out.println("<tr><th>Account Type</th><td><input type='text' name='accType'></td></tr>");
		out.println("<tr><th>Account Branch</th><td><input type='text' name='accBranch'></td></tr>");
		out.println("<tr><h></th><td><input type='submit' value='submit'></td></tr>");
		
		out.println("</form></table></center></body>");
	}

}
