package com.xworkz.association;

public class Clip {
	String color;
	String type;

	public Clip(String color, String type)
	{
		this.color=color;
		this.type=type;
	}

	public void printing()
	{
		System.out.println("Clip color :"+this.color);
		System.out.println("Clip Type :"+this.type);

	}

}
