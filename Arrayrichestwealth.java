package com.tridib;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayrichestwealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                //System.out.println("enter the numbers");
                arr[row][col] = sc.nextInt();
            }
        }
        for (int[] a : arr)
        {
            System.out.println(Arrays.toString(a));

        }
        System.out.println("Maximum wealth "+rich(arr));

    }static int rich(int[][] number)
    {
        int max = 0;
        for (int i = 0; i < number.length; i++) {
            int sum= 0;
            for (int j = 0; j < number[i].length; j++) {
                sum+=number[i][j];

            }
            if(sum>max)
            {
                max=sum;
            }

        }return max;
    }
}
