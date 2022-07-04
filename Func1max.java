package com.tridib;

import java.util.Scanner;

public class Func1max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maximum(a,b,c);
    }
    static void maximum(int a, int b , int c)
    {
        int max = a;
        if(max < b)
        {
            max = b;
        }
        if(max < c)
        {
            max = c;
        }
        System.out.println(max);
    }
}
