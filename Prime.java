package com.tridib;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        if (num <= 1) {
            System.out.println("neither prime nor composite");
        } else {
            int c = 2;
            int count = 0;
            while (c * c <= num)
            {
                if (num % c == 0)
                {
                    System.out.println("not prime");
                    count++;
                    break;
                }
                c++;

            }
            if (count == 0) {
                System.out.println("prime number");
            }
        }
    }
}




