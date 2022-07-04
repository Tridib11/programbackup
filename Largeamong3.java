package com.tridib;

import java.util.Scanner;

public class Largeamong3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //maximun of the three number using


        //1 method


        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        int max = a;
//        if (b > a)
//        {
//            max = b;
//        }
//        if (c > max)
//        {
//            max = c;
//        }
//        System.out.println(max);

        // another way


//        int max = 0;
//        if (a>b)
//        {
//            max = a;
//        }
//        else
//        {
//            max = b;
//        }
//        if (c > max)
//        {
//            max = c;
//        }
//        System.out.println(max);

        // another way

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);


        }

    }

