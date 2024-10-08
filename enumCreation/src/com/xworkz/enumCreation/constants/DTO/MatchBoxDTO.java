package com.xworkz.enumCreation.constants.DTO;

public class MatchBoxDTO {
	private Double cost;
	private String brand;

	public MatchBoxDTO() {
	}

	public MatchBoxDTO(Double cost, String brand) {
		this.cost = cost;
		this.brand = brand;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "MatchBoxDTO [cost=" + cost + ", brand=" + brand + "]";
	}
}