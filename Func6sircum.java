package com.tridib;

import java.util.Scanner;

public class Func6sircum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double an = circumference(a);
        System.out.println(an);
        double anb = circle(a);
        System.out.println(anb);

    }
    static double circumference(double r)
    {
        double ans = 2 * 3.14 * r;
        return ans;

    }
    static double circle(double s)
    {
        double an = circumference(s) / 3.14* 2;
        return an;
    }
}
