package com.tridib;

import java.util.Scanner;

public class Arraygooodpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the array");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println(goodpair(arr));
    }static int goodpair(int[] arr)
    {
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                {
                    count++;
                }

            }

        }
        return count;
    }
}
