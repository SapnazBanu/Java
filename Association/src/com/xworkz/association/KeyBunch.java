package com.xworkz.association;

public class KeyBunch {
	String material;
	Key key;

	public KeyBunch(String material, Key key)
	{
		this.material=material;
		this.key=key;

	}

	public void display() {
		System.out.println("Material : " + this.material);
		key.connect();
	}
}
