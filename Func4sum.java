package com.tridib;

import java.util.Scanner;

public class Func4sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a= sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        add(a,b);
    }
    static void add(int a, int b)
    {
        int sum = a + b;
        System.out.println(sum);
    }
}
