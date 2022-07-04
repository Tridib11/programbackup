package com.tridib;

import java.util.Scanner;

public class Findthefactorsthenfindtheprimenumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factorial(num);
    }

    static void factorial(int num)
    {
        System.out.print("The prime numbers among the factors of the number are ");
        for (int i = 1; i < num; i++)
        {
            if (num % i == 0)
            {

                if (isprime(i))
                {

                    System.out.print(i+ "  ");

                }

            }

        }
    }

    static boolean isprime(int num)
    {
        if (num <= 1)
        {
            return false;
        }
        int c = 2;
        while (c * c <= num)
        {
            if (num % c == 0)
            {
                return false;
            }
            c++;
        }
        return true;
    }
}





