package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.Devu;
import com.xworkz.inheritance.Gunashree;
import com.xworkz.inheritance.Shwetha;
import com.xworkz.inheritance.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {

		Gunashree gunashree = new Gunashree();
		gunashree.wash();
		System.out.println("--------------");

		WaterBottle waterbottle = new WaterBottle();

		Shwetha shwetha = new Shwetha();
		shwetha.store(waterbottle);
		System.out.println("--------------");

		Devu devu = new Devu();
		devu.waterbottle = new WaterBottle();
		devu.use();

	}

}