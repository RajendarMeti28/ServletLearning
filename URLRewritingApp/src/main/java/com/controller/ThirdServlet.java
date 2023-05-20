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
@WebServlet("/test3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String depName = request.getParameter("depName");
		String depAmount = request.getParameter("depAmount");
		
		HttpSession session = request.getSession();
		
		String accName = (String) session.getAttribute("accName");
		String accNo = (String) session.getAttribute("accNo");
		String accType = (String) session.getAttribute("accType");
		String accBranch = (String) session.getAttribute("accBranch");
		
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<body bgColor='light-green'>");
		out.println("<center><table border=1, bgColor='cyan'>");
		out.println("<tr><th>Account Number</th><td>"+ accNo +"</td></tr>");
		out.println("<tr><th>Account Name</th><td>"+ accName +"</td></tr>");
		out.println("<tr><th>Account Type</th><td>"+ accType +"</tr>");
		out.println("<tr><th>Account Branch</th><td>" + accBranch +"</td></tr>");
		out.println("<tr><th>Depositor Name</th><td>"+ depName +"</td></tr>");
		out.println("<tr><th>Deposited Amount</th><td>" + depAmount +"</td></tr>");
		
		out.println("</form></table></center></body>");
	}

}
