package com.tridib;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int a = 30;
//        float b =20f;
//        long c = 7998970L;
//        byte b = 42;
//        char c = 'a';
//        short s = 1024;
//        int i = 50000;
//        float f = 5.67f;
//        double d = 0.1234;
//        double result = (f * b) + " " + (i / c) + " " + (d - s);
////        System.out.println((a+c)+" "+(b+c));
//        System.out.println(result);
//        System.out.println(3 * 893648340830f);
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        // ekhane shob kota chto size er type gulo convert hoche boro type e eita ke ble type casting
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);
    }
}
