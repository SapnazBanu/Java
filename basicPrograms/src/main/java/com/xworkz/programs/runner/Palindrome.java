package com.xworkz.programs.runner;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String name = "madam";
        String reversed = new StringBuilder(name).reverse().toString();
        if (name.equals(reversed))
        {
            System.out.println("is a palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}
