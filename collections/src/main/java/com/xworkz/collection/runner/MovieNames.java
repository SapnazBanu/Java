package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class MovieNames {
    public static void main(String[] args) {
        Collection<String> movie=new ArrayList<>();
        movie.add("Sita Ramam");
        movie.add("3 Idiots");
        movie.add("Jab we met");
        movie.add("Lucky Bhaskar");
        movie.add("Paramatma");
        movie.add("Moggina Manasu");
        movie.add("Lucky");
        movie.add("Max");
        movie.add("UI");
        movie.add("Martin");
        System.out.println("String :"+movie);
        System.out.println("String size:"+movie.size());
        movie.clear();
        System.out.println("String size:"+movie.size());
    }
}
