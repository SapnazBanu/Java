package com.xworkz.programs.runner;

import java.sql.Array;
import java.util.Arrays;

public class BS {
    public static void main(String[] args) {
        System.out.println("Sorted array");
        int[] ref={ 12, 8, 56, 24, -9, -2, 58, 43, 78, 24, 49, 77, 156, 15, -9, 12, 46, 25, 77, 88, 25, 90, 34};

        for(int i=0;i <ref.length-1;i++)
        {
            for(int j=0; j< ref.length -1 - i;j++)
            {
                if(ref[j] >ref[j+1])
                {
                    int temp=ref[j];
                    ref[j]=ref[j+1];
                    ref[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<ref.length;i++)
        {
            System.out.println(ref[i] +" ");
        }
    }
}
