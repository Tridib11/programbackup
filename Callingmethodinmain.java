package com.tridib;

import java.util.Scanner;
//passing value while calling vaue in main
public class Callingmethodinmain {
    public static void main(String[] args) {
        int anser = sum3(20,30);
        System.out.println(anser);
    }
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
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
