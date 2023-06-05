package com.listeners;

import java.util.Date;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class DemoRequestListener
 *
 */
@WebListener
public class DemoRequestListener implements ServletRequestListener {

	public static int count = 0;

    public void requestDestroyed(ServletRequestEvent sre)  { 
         System.out.println("Request object destroyed :: "+new Date());
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
        count++;
        System.out.println("Request Object got created at ::"+new Date());
        System.out.println("No of hits for this web applicatin is :: "+count);
    }
	
}
