package com.tridib;

import java.util.Scanner;

public class Func2evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        even(a);
    }
    static void even(int num)
    {
        if (num%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }

}
