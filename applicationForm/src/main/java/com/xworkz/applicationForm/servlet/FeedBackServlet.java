package com.xworkz.applicationForm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.job.dto.FeedbackDTO;
@WebServlet(loadOnStartup = 1,urlPatterns = "/copy")
public class FeedBackServlet extends HttpServlet{
	public FeedBackServlet() {
		System.out.println("Created no-arg const of feedbackServlet");
		}

		public void init() throws ServletException {
	System.out.println("no-arg const of FoodOrderServlet");			
	super.init();
			}
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("running service in feedbackServlet...");
		String Name=req.getParameter("name");
		String email=req.getParameter("eamil");
		String comments=req.getParameter("comments");

		System.out.println("after getting all par");
		

		FeedbackDTO feedbackDTO=new FeedbackDTO(Name,email,comments);
		System.out.println("jobDTO:"+feedbackDTO);
		System.out.println("after getting all par");
	}
	}
