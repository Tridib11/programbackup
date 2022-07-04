package com.tridib;

import java.util.Scanner;

public class Typecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch= in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z' )
        {
            System.out.println("Lowwer case");

        }
        else{
            System.out.println("Uppercare");
        }
    }
}
