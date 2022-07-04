package com.tridib;
//https://leetcode.com/problems/missing-number/
public class Missingnumber {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
       int length = nums.length;
       int sum= length*(length+1)/2;
       int totalsum=0;
       for(int num:nums)
       {
           totalsum+=num;
       }
       return (sum-totalsum);
    }
}
