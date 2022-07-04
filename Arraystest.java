package com.tridib;
import java.util.Arrays;
import java.util.Scanner;
public class Arraystest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // printing type 1

//        }for (int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i] + " ");
//        }


        // printing type 2

//        for (int j : arr) {
//            System.out.print(j);
//        }

        //type 3 printtine

        System.out.print(Arrays.toString(arr));
    }
}
