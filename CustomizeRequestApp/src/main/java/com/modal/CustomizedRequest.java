package com.modal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class CustomizedRequest extends HttpServletRequestWrapper {

	public CustomizedRequest(HttpServletRequest request) {
		super(request);
	}

	@Override
	public String getParameter(String name) {
		String word = super.getParameter(name);
		
		if(word.equalsIgnoreCase("rajendar") || word.equalsIgnoreCase("raj")) {
			return "Tyler";
		}
		
		return word;
	}
	
	

}
