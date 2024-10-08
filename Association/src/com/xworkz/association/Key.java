package com.xworkz.association;

public class Key {
	double weight;
	String brand;

	public Key(double weight, String brand) {
		this.weight = weight;
		this.brand = brand;

	}

	public void connect() {
		System.out.println("Key Weight :" + weight);
		System.out.println("Key Brand :" + brand);

	}
}
