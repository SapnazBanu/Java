package com.xworkz.applicationForm.DTO;

public class CricketTicketDTO {
	private String groundname;
	private String customername;
	private String customeremail;
	private String seattype;
	private int nooftickets;

	public CricketTicketDTO(String groundname, String customername, String customeremail, String seattype,
			int nooftickets) {
		super();
		this.groundname = groundname;
		this.customername = customername;
		this.customeremail = customeremail;
		this.seattype = seattype;
		this.nooftickets = nooftickets;
	}

	@Override
	public String toString() {
		return "CricketTicketDTO [groundname=" + groundname + ", customername=" + customername + ", customeremail="
				+ customeremail + ", seattype=" + seattype + ", nooftickets=" + nooftickets + "]";
	}

	public String getGroundname() {
		return groundname;
	}

	public void setGroundname(String groundname) {
		this.groundname = groundname;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public String getSeattype() {
		return seattype;
	}

	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}

	public int getNooftickets() {
		return nooftickets;
	}

	public void setNooftickets(int nooftickets) {
		this.nooftickets = nooftickets;
	}
}