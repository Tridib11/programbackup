package com.tridib;

import java.util.Scanner;

public class Func3age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int a = sc.nextInt();
        vote(a);
    }
    static void vote(int age)
    {
        if (age>=18)
        {
            System.out.println("can vote");
        }
        else
        {
            System.out.println("cant vote");
        }
    }
}
