package com.tridib;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayssuffleanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int[] nums = new int[2*size];
        System.out.println("enter elements");
        for (int i = 0; i < nums.length; i++)
        {
            nums[i]=sc.nextInt();
        }

            System.out.println(Arrays.toString(suffle(nums, size)));



    }static int[] suffle(int[] nums,int n)
    {
        int[] ans = new int[2*n];
        int j = 0;
        for (int i = 0; i < 2*n; i=i+2)
        {
            ans[i]=nums[j];
            ans[i+1]= nums[j+n];
            j++;

        }return ans;
    }
}
