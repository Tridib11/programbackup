package com.tridib;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        System.out.println("Enter the number");
        int num = in.nextInt();
        int constant = num;
        while (num > 0)
        {
            int lastd = num % 10;
            num = num / 10;
            ans += Math.pow(lastd,3);

        }
        if ( ans == constant)
        {
            System.out.println("Armstrong number");

        }
        else
        {
            System.out.println("Not armstrong");
        }

    }
}
