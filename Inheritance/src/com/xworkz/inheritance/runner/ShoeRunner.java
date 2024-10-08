package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.Divya;
import com.xworkz.inheritance.Harshitha;
import com.xworkz.inheritance.Omkar;
import com.xworkz.inheritance.Shoe;

public class ShoeRunner {

	public static void main(String[] args) {
		
		Divya divya=new Divya();
		divya.wear();
		System.out.println("---------------");
		
		Shoe shoe=new Shoe();
		
		Omkar omkar=new Omkar();
		omkar.wash(shoe);
		System.out.println("---------------");
		
		Harshitha harshitha =new Harshitha();
		harshitha.shoe=new Shoe();
		harshitha.dry();
				
	}

}
