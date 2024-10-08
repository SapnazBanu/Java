package com.xworkz.functionalinterfaces;

public class Labour {
 public void startMotor(Starter starter) {
	 System.out.println("running startMotor in Labour");
	 if(starter!=null) {
		 System.out.println("starter is not null");
		 starter.on();
	 }else {
		 
		 System.out.println("starter is not null");
		 }
	 System.out.println("exit startmotor in labour");
	 }
 public void orderFood(FoodApp foodApp)
 {
 	 if(foodApp!=null)
 	 {
 		 foodApp.order("Maggie", 1);
 	 }
 }
 }
	 
 