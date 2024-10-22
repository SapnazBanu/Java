package com.xworkz.applicationForm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.job.dto.ConcertTicketDTO;

@WebServlet(loadOnStartup = 1, urlPatterns = "/seen")
public class ConcertTicketServlet extends HttpServlet {

	public ConcertTicketServlet() {
		System.out.println("Created no-arg const of ConcertTicketServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("no-arg const of ConcertTicketServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in concertServlet...");
		String location = req.getParameter("location");
		String artistname = req.getParameter("artistname");
		String tickettype = req.getParameter("tickettype");
		String nooftickets = req.getParameter("nooftickets");
		String preferencetype = req.getParameter("preferencetype");
		// print it or debug mode
		System.out.println("after getting all par");
		int convertesSalary = Integer.valueOf(nooftickets);

		ConcertTicketDTO concertTicketDTO = new ConcertTicketDTO(location, artistname, tickettype, convertesSalary,
				preferencetype);
		System.out.println("jobDTO:" + concertTicketDTO);
		System.out.println("after getting all par");
	}
}