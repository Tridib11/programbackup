package com.tridib;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] arr ={6,2,4,8,9,13};
        int target = 14;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[] {i,j} ;
                }

            }

        }
        return new int[] {-1,-1};


    }
}
