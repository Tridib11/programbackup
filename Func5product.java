package com.tridib;

import java.util.Scanner;

public class Func5product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        product(num1,num2);
    }
    static void product(int a , int b)
    {
        int product = a*b;
        System.out.println(product);
    }
}
