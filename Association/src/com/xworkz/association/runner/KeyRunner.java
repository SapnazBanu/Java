package com.xworkz.association.runner;

import com.xworkz.association.Key;
import com.xworkz.association.KeyBunch;

public class KeyRunner {
	public static void main(String[] args)
	{

		Key key=new Key(1,"Kwikset");
		KeyBunch keybunch=new KeyBunch("Metal", key);
		keybunch.display();
		System.out.println("----------");


		Key key1=new Key(1.5,"Medeco");
		KeyBunch keybunch1=new KeyBunch("Alumnium", key1);
		keybunch1.display();
		System.out.println("----------");


		Key key2=new Key(2,"Godrej");
		KeyBunch keybunch2=new KeyBunch("Metal", key2);
		keybunch2.display();
		System.out.println("----------");


	}
}
