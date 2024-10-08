package com.xworkz.runner;

import com.xworkz.functionalinterfaces.FoodApp;
import com.xworkz.functionalinterfaces.Labour;
import com.xworkz.functionalinterfaces.Starter;

public class StarterRunner {
public static void main(String[] args) {
	Starter starter=()->{
		System.out.println("Starter is Running ");
	};
	Labour labour=new Labour();
	labour.startMotor(starter);
	
	 FoodApp foodApp=(String item,int quantity)->{
			System.out.println("FoodApp Item:"+item);
			System.out.println("FoodApp quantity:"+quantity);	
		 };
		 labour.orderFood(foodApp);
}
}
