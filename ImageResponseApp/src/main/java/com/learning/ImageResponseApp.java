package com.learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImageResponseApp
 */
@WebServlet(urlPatterns={"/image"}, loadOnStartup=1)
public class ImageResponseApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static {
		
	}
	
    public ImageResponseApp() {
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/png");
		ServletOutputStream os = response.getOutputStream();
		
		File file = new File("C:\\Users\\rmeti\\Desktop\\dev\\Spring-learning\\Servlets\\ImageResponseApp\\Avatar.png");
		FileInputStream fis = new FileInputStream(file);
		
		 byte[] buf = new byte[1024];
	       int count = 0;
	       while ((count = fis.read(buf)) >= 0) {
	         os.write(buf, 0, count);
	      }
		os.flush();
		fis.close();
		os.close();
	}

}
