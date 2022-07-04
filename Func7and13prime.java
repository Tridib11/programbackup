package com.tridib;

import java.util.Scanner;

public class Func7and13prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int number1 = in.nextInt();
        if (primecheck(number1) == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }

    static boolean primecheck(int num)
    {
        if (num <= 1)
        {
            return false;
        }
        int c = 2;
        while (c*c <= num)
        {
            if(num%c==0)
            {
                return false;

            }c++;
        }
        if(c*c >= num)
        {
            return true;
        }return false;
    }
}

