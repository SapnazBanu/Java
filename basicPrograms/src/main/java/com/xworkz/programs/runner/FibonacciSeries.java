package com.xworkz.programs.runner;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=0,b=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }

    }
}