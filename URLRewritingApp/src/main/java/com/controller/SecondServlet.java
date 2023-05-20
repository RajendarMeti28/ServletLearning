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
@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accType = request.getParameter("accType");
		String accBranch = request.getParameter("accBranch");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("accType", accType);
		session.setAttribute("accBranch",accBranch);
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<body bgColor='light-green'>");
		out.println("<center><table>");
		out.println("<form method='get' action='"+  response.encodeURL("./test3")+"')");
		out.println("<tr><th>Depositor Name</th><td><input type='text' name='depName'></td></tr>");
		out.println("<tr><th>Deposit Amount</th><td><input type='text' name='depAmount'></td></tr>");
		out.println("<tr><h></th><td><input type='submit' value='submit'></td></tr>");
		
		out.println("</form></table></center></body>");
	}

}
