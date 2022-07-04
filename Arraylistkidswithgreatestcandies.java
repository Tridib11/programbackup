package com.tridib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylistkidswithgreatestcandies {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        int[] j = new int[size];
        System.out.println("enter the array");
        for (int i = 0; i < size; i++) {
            j[i]=sc.nextInt();

        }
        System.out.println("enter the extracandies");
        int extracandiess = sc.nextInt();
        System.out.println(kidswithcandies(j,extracandiess));


    }
    static List<Boolean> kidswithcandies(int[] candies,int extra)
    {
        ArrayList<Boolean> list = new ArrayList<>();
        int maxvalue= candies[0];
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>maxvalue)
            {
                maxvalue=candies[i];
            }


        }
        for (int j = 0; j < candies.length; j++) {
            int newcandies = candies[j]+ extra;
            if (newcandies>=maxvalue)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }

        }
        return list;

    }
}
