package com.xworkz.applicationForm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.job.dto.JobDTO;
import com.xworkz.job.dto.MovieTicketDTO;

@WebServlet(loadOnStartup = 1, urlPatterns = "/submit")
public class MovieTicketServlet extends HttpServlet {
	public MovieTicketServlet() {
		System.out.println("Created no-arg const of movieticketServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("no-arg const of movieticketServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in movieticketServlet...");
		String name = req.getParameter("name");
		String totalticket = req.getParameter("totaltickets");
		String theaterName = req.getParameter("theaterName");
		String seatType = req.getParameter("seatType");
		String donation = req.getParameter("donation");
		String date = req.getParameter("date");
		String time = req.getParameter("time");
		// print it or debug mode
		System.out.println("after getting all par");
		double convertedDonation = Double.valueOf(donation);
		double convertedDate = Double.valueOf(date);
		int convertedTime = Integer.valueOf(time);
		int convertedTotalticket = Integer.valueOf(totalticket);

		MovieTicketDTO MovieTicketDTO = new MovieTicketDTO(name, convertedTotalticket, theaterName, seatType,
				convertedDonation, convertedDate, convertedTime);
		System.out.println("jobDTO:" + MovieTicketDTO);
		System.out.println("after getting all par");
	}
}