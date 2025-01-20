package com.xworkz.programs.runner;

public class CountOccurrences {
    public static void main(String[] args) {
        String str = "programming";
        char ch = 'g';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The character '" + ch + "' appears " + count + " times.");
    }
}

