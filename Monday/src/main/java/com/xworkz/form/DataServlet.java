package com.xworkz.form;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataServlet extends HttpServlet {
	public DataServlet() {
		System.out.println("Created DataServlet...");
	}
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws 
	ServletException,IOException{
		System.out.println("running service in DataServlet...");
		String name=req.getParameter("customer");
		String email=req.getParameter("email");
		System.out.println("Email:"+email);
		System.out.println("Name:"+name);
		
	}

}
