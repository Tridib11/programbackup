package com.tridib;


import java.util.Scanner;
//Displaying the circumfereece and the circle
public class Func6newway {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        double rad = in.nextDouble();
        double an = circum(rad);
        System.out.println("circumference "+an);
        double rb = circle(rad);
        System.out.println("circle " + rb);
    }
    static double circum(double radius)
    {
        double ans = 2 * radius * 3.14;
        return ans;  //ekhane je ei lekha ache je return ans eitar mane opore je circum() er value hobe seta.
    }
    static double circle(double s)
    {
        double cir = circum(s)/2*3.14;
        //System.out.println("Circle "+ cir);
        return cir;
      }
    }
