package com.xworkz.casting.runner;

import com.xworkz.casting.IPhone;
import com.xworkz.casting.Phone;
import com.xworkz.casting.Sapna;

public class PhoneRunner {

	public static void main(String[] args) {
		
		Sapna sapna= new Sapna();
		Phone phone= new Phone();
		IPhone iphone= new IPhone();
		sapna.user(phone);
		System.out.println("--------------");
		sapna.user(iphone);
	}

}