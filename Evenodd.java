package com.tridib;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        float number = input.nextFloat();
        if ((number % 2) == 0){
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }


    }
}
