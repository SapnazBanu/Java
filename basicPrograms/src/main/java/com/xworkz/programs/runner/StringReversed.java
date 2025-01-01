package com.xworkz.programs.runner;

import java.util.Scanner;

public class StringReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter input:");
        String input = scanner.nextLine();
        String reversed="";
        for(int i=input.length()-1;i>=0;i--)
        {
            reversed +=input.charAt(i);
        }
        System.out.println("reversed string is :"+reversed);
        scanner.close();
    }
}
