package com.tridib;

import java.util.Scanner;

public class Palindromdofunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter he number");
        int n = in.nextInt();
        int dildo= palin(n);
        if(dildo == n)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a plaindrome");
        }
    }
    static int palin(int n)
    {
        int d,sum = 0;
        do
        {
            d = n%10;
            sum = sum*10+d;
            n = n/10;


        }while(n!=0);
        return sum;
    }
}
