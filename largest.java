package com.tridib;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the first number");
        int number1 = sc.nextInt();
        System.out.println("write the second number ");
        int number2 = sc.nextInt();
        if (number1 > number2){
            System.out.println("Greater :"+ " " + number1);
        }
        else
        {
            System.out.println("Greater :"+ " " + number2);
        }

    }
}
