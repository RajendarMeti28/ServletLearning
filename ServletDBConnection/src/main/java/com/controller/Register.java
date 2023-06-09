package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet(urlPatterns={"/register"},initParams = {
		@WebInitParam(name="url", value = "jdbc:mysql://localhost:3306/spring"),
		@WebInitParam(name="user", value = "root"),
		@WebInitParam(name="password", value = "root"),
})
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection connection;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	
    	ServletConfig config = getServletConfig();
    	String url = (String) config.getInitParameter("url");
    	String user = (String) config.getInitParameter("user");
    	String password = (String) config.getInitParameter("password");
    	
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		connection = DriverManager.getConnection(url, user, password);			
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = (String) request.getParameter("name");
		String password = (String) request.getParameter("password");
		String email = (String) request.getParameter("email");
		String city = (String) request.getParameter("city");
		
		
		String result = "Registration failed..";
		String query = "insert into employee(`name`,`email`,`password`,`city`) values(?,?,?,?)";
		try {
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1, name);
			pst.setString(2, email);
			pst.setString(3,password);
			pst.setString(4, city);
			
			int rows = pst.executeUpdate();
			if(rows>0) {
				result = "Registration succesful";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h1 align='center'>"+result+"</h1></body></html>");
		
		out.close();
	}

}
