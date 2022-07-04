package com.tridib;

public class runingsumin1darray {
    public static void main(String[] args) {
       // https://leetcode.com/problems/running-sum-of-1d-array/
    }
    static int[] runningSum(int[] nums) {
        int[] sums =new int[nums.length];
        sums[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = nums[i]+sums[i-1];

        }
        return sums;

    }

}
