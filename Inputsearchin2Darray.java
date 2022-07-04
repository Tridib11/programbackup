package com.tridib;
import java.util.Arrays;
import java.util.Scanner;
public class Inputsearchin2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the size");
            int size = sc.nextInt();
            arr[i] = new int[size];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
            for(int[] num: arr)
            {
                System.out.println(Arrays.toString(num));
            }
        }
    }



