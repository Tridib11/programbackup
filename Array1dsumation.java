package com.tridib;

import java.util.Arrays;
import java.util.Scanner;

public class Array1dsumation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(sumation(nums)));
    }static int[] sumation(int[] nums)
    {
        int[] sums = new int[nums.length];
        sums[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i]=nums[i]+sums[i-1];


        }return sums;
    }
}
