package com.xworkz.applicationForm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.job.dto.CricketTicketDTO;

@WebServlet(loadOnStartup = 1, urlPatterns = "/kick")
public class CricketTicketServlet extends HttpServlet {
	public CricketTicketServlet() {
		System.out.println("Created no-arg const of cricketTicketServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("no-arg const of cricketTicketServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in cricketServlet...");
		String groundName = req.getParameter("groundname");
		String customerName = req.getParameter("customername");
		String customerEmail = req.getParameter("customeremail");
		String seatType = req.getParameter("seattype");
		String noOfTickets = req.getParameter("nooftickets");
		// print it or debug mode
		System.out.println("after getting all par");
		int convertesNoOfTickets = Integer.valueOf(noOfTickets);

		CricketTicketDTO cricketTicketDTO = new CricketTicketDTO(groundName, customerName, customerEmail, seatType,
				convertesNoOfTickets);
		System.out.println("jobDTO:" + convertesNoOfTickets);
		System.out.println("after getting all par");
	}
}