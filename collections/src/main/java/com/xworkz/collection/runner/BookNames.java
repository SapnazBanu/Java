package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class BookNames {
    public static void main(String[] args) {
        Collection<String> books=new ArrayList<>();
        books.add("Thousand Splendid Suns");
        books.add("Kite Runner");
        books.add("Forty Rules of Love");
        books.add("Road Beckons");
        books.add("Norweigan Woods");
        books.add("Starts with us");
        books.add("Ends with us");
        books.add("The stationary shop of Theran");
        books.add("A house without windows");
        books.add("Warmth");
        System.out.println("books :"+books);
        System.out.println("books size:"+books.size());
        books.clear();
        System.out.println("books size:"+books.size());




    }
}
