package com.xworkz.applicationForm.DTO;

public class MovieTicketDTO {
	private String name;
	private int totalticket;
	private String theaterName;
	private String seatType;
	private double donation;
	private double date;
	private int time;

	public MovieTicketDTO(String name, int totalticket, String theaterName, String seatType, double donation,
			double date, int time) {
		super();
		this.name = name;
		this.totalticket = totalticket;
		this.theaterName = theaterName;
		this.seatType = seatType;
		this.donation = donation;
		this.date = date;
		this.time = time;
	}

	@Override
	public String toString() {
		return "MovieTicketDTO [name=" + name + ", totalticket=" + totalticket + ", theaterName=" + theaterName
				+ ", seatType=" + seatType + ", donation=" + donation + ", date=" + date + ", time=" + time + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalticket() {
		return totalticket;
	}

	public void setTotalticket(int totalticket) {
		this.totalticket = totalticket;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public double getDonation() {
		return donation;
	}

	public void setDonation(double donation) {
		this.donation = donation;
	}

	public double getDate() {
		return date;
	}

	public void setDate(double date) {
		this.date = date;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}