package com.tridib;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/concatenation-of-array/
public class concat {
    public static void main(String[] args) {
        int[] arr= {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));

    }
    static int[] getConcatenation(int[] nums) {
        int[] arr = new int[2* nums.length];
        for (int i = 0; i < arr.length; i++) {
            if(i<nums.length)
            {
                arr[i] = nums[i];
            }
            else
            {
                arr[i]=nums[i-nums.length];
            }

        }
        return arr;


    }
}
