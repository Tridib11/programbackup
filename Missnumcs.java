package com.tridib;

import java.util.Arrays;

public class Missnumcs {
    public static void main(String[] args)
    {
        int[] arr ={4,0,2,1};

        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums)
    {
        int i =0;
        while(i<nums.length)
        {
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correct])
            {
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }
        for(int index=0;index<nums.length;index++)
        {
            if(nums[index] != index)
            {
                return index;
            }
        }
        return -1;
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first]=temp;

    }
}
