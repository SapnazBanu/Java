package com.xworkz.enumCreation.constants;

public enum TicketType {
	ONLINE(150), OFFLINE(200);

	private final double cost;

	TicketType(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}