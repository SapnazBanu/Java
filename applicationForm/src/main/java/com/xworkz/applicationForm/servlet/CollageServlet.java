package com.xworkz.applicationForm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.job.dto.CollageDTO;

@WebServlet(loadOnStartup = 1, urlPatterns = "/send")
public class CollageServlet extends HttpServlet {

	public CollageServlet() {
		System.out.println("Created no-arg const of collageServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("no-arg const of FoodOrderServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in collageServlet...");
		String name = req.getParameter("name");
		String email = req.getParameter("eamil");
		String mobile = req.getParameter("mobile");
		String address = req.getParameter("address");
		String fathername = req.getParameter("fathername");
		String mothername = req.getParameter("mothername");
		String course = req.getParameter("course");
		String age = req.getParameter("age");
		// print it or debug mode
		System.out.println("after getting all parameter");
		long convertedMobile = Long.valueOf(mobile);
		int convertedAge = Integer.valueOf(age);

		CollageDTO collageDTO = new CollageDTO(name, email, convertedMobile, address, fathername, mothername,
				convertedAge);
		System.out.println("collageDTO:" + collageDTO);
	}
}
