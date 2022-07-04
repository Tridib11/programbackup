package com.tridib;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayconcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc .nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(concatenaion(nums)));
    }static int[] concatenaion(int[] nums)
    {
        int[] ans = new int[2*nums.length];
        for (int i = 0; i < ans.length; i++) {
            if(i<nums.length)
            {
                ans[i] = nums[i];

            }
            else
            {
                ans[i]= nums[i-nums.length];
            }

        }return ans;
    }
}
