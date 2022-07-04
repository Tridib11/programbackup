package com.tridib;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter a number");
        n = sc.nextInt();
        int copy = n;
        int sum =0;
        int d;

        while( n != 0)
        {
            d = n%10;
            sum = sum *10+d;
            n= n/10;
        }
        if( copy == sum)
        {
            System.out.println("Palindrome");

        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}
