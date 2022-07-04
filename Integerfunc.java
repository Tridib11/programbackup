package com.tridib;

import java.util.Scanner;

public class Integerfunc {
    public static void main(String[] args) {
        int anser = sum2();
        System.out.println(anser);
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1 = in.nextInt();
        System.out.println("Enter number2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}

