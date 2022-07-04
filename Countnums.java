package com.tridib;

import java.util.Scanner;

public class Countnums {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int find = in.nextInt();
        int count = 0;
        while (num > 0)
        {
            int rem = num % 10;
            if (rem == find) //chccking last digit
            {
                count++;
            }
            num = num /10; // removing tha last digit

        }
        System.out.println("number of occuranes "+ count);

    }
}
