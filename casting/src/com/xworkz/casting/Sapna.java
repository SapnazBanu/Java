package com.xworkz.casting;

public class Sapna {
	public void user(Phone phone) {
		System.out.println("Running a user in Osama");
		phone.calling();

		if (phone instanceof IPhone) {
			System.out.println("Instance of I Phone");
			IPhone iphone = (IPhone) phone;
			iphone.security();
		}
	}
}
