package com.tridib;
import java.util.Arrays;
import java.util.Scanner;
public class Array2dMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[3][3];

        for (int row= 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                //System.out.println("enter the numbers");
                arr[row][col] = sc.nextInt();
            }
        }
        // first way to print

//            for (int row= 0; row < arr.length ; row++) {
//                for (int col = 0; col <arr[row].length ; col++) {
//                    //arr[row][col]=sc.nextInt();
//                    System.out.print(arr[row][col] + " ");
//                }
//                System.out.println();
//            }

        // second way to print
//        for (int row= 0; row < arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //third way(enchanced for loop

        for(int[] a : arr)
        {
            System.out.println(Arrays.toString(a));
        }


    }

}
