package com.tridib;

import java.util.Scanner;

public class infinitecalculator {
    public static void main(String[] args)

    {
        System.out.println("\n" +
                "░█████╗░░█████╗░██╗░░░░░░█████╗░██╗░░░██╗██╗░░░░░░█████╗░████████╗░█████╗░██████╗░\n" +
                "██╔══██╗██╔══██╗██║░░░░░██╔══██╗██║░░░██║██║░░░░░██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗\n" +
                "██║░░╚═╝███████║██║░░░░░██║░░╚═╝██║░░░██║██║░░░░░███████║░░░██║░░░██║░░██║██████╔╝\n" +
                "██║░░██╗██╔══██║██║░░░░░██║░░██╗██║░░░██║██║░░░░░██╔══██║░░░██║░░░██║░░██║██╔══██╗\n" +
                "╚█████╔╝██║░░██║███████╗╚█████╔╝╚██████╔╝███████╗██║░░██║░░░██║░░░╚█████╔╝██║░░██║\n" +
                "░╚════╝░╚═╝░░╚═╝╚══════╝░╚════╝░░╚═════╝░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝");
        do {
            Scanner rushita= new Scanner(System.in);
//            System.out.println("\n" +
//                    "░█████╗░░█████╗░██╗░░░░░░█████╗░██╗░░░██╗██╗░░░░░░█████╗░████████╗░█████╗░██████╗░\n" +
//                    "██╔══██╗██╔══██╗██║░░░░░██╔══██╗██║░░░██║██║░░░░░██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗\n" +
//                    "██║░░╚═╝███████║██║░░░░░██║░░╚═╝██║░░░██║██║░░░░░███████║░░░██║░░░██║░░██║██████╔╝\n" +
//                    "██║░░██╗██╔══██║██║░░░░░██║░░██╗██║░░░██║██║░░░░░██╔══██║░░░██║░░░██║░░██║██╔══██╗\n" +
//                    "╚█████╔╝██║░░██║███████╗╚█████╔╝╚██████╔╝███████╗██║░░██║░░░██║░░░╚█████╔╝██║░░██║\n" +
//                    "░╚════╝░╚═╝░░╚═╝╚══════╝░╚════╝░░╚═════╝░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝");
            System.out.println("(+) Is For Adition");
            System.out.println("(-) Is for substraction");
            System.out.println("(*) Is for multiplication");
            System.out.println("(/) Is for division");
            System.out.println("(%) Is for modulous");
            System.out.println("(^) Is for sqrt");
            System.out.println("(X or x) Is for terminating the sequence");
            System.out.println("Enter the operator");
            char c = rushita.next().trim().charAt(0);
            if(c=='x'|| c=='X')
            {
                break;
            }
            System.out.println(calculate(c));
        }
        while(true);


    }
    static double calculate(char op)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num = in.nextDouble();
        System.out.println("Enter the second number");
        double num1 = in.nextDouble();
        double ans =0;
        if(op=='+' || op== '-' || op == '*' || op == '/' || op == '%' || op =='^')
        {
            if(op == '+')
            {
                ans = num + num1;
            }
            if(op == '-')
            {
                ans = num-num1;
            }
            if(op == '*')
            {
                ans = num*num1;
            }
            if(op == '%')
            {
                ans = num%num1;
            }
            if(op == '/')
            {
                if(num1==0)
                {
                    ans = 0;
                }
                else
                {
                    ans = num / num1;
                }
            }
            if(op == '^')
            {
                ans = Math.pow(num,num1);
            }
//            if(op == 'l')
//            {
//                ans = Math.log(num);
//                //ans = Math.log(num1);
//            }
//            if(op == 'L')
//            {
//                ans = Math.log10(num);
//                ans = Math.log10(num1);
//            }
            if(op == 'M')
            {
                if(num>num1)
                {
                    ans = num;
                }
                else
                {
                    ans = num1;
                }
            }
        }
        return ans;
    }
}
