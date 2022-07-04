package com.tridib;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(254);
//        list.add(297);
//        System.out.println(list.contains(654));
//        list.set(0,23);
//        list.remove(2);
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }
    }
}
