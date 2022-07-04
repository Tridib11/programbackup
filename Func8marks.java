package com.tridib;

import java.util.Scanner;

public class Func8marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter");
        int inp = in.nextInt();
        System.out.println(grade(inp));

    }
    static String grade(int age)
    {
        String grde=null;

        if (age <= 40) {
            grde = "Fail";
        }

        if (age >= 91 && age <=100)
        {
            grde ="AA";
        }
        if (age >= 81 && age <=90)
        {
            grde ="AB";
        }
        if (age >= 71 && age <=80)
        {
            grde ="BB";
        }
        if (age >= 61 && age <=70)
        {
            grde ="BC";
        }
        if (age >= 51 && age <=60)
        {
            grde ="CD";
        }
        if (age >= 41 && age <=50)
        {
            grde ="DD";
        }

        return grde;
    }
}
