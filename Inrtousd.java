package com.tridib;

import java.util.Scanner;

public class Inrtousd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rupees ");
        double rupees = sc.nextDouble();

        double conversiontousd = (rupees*0.013);
        System.out.println("USD :"+ " " + conversiontousd);



    }
}
