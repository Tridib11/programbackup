package com.tridib;

import java.util.Arrays;

public class FirstAndLastPositionOfFortedArray {
    public static void main(String[] args) {
        int[] nm= {5,7,7,8,8,10};
        int target = 6;
        int[] nmans =  searchRange(nm,target);
        System.out.println(Arrays.toString(nmans));

    }
    static public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0]=search(nums,target,true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }
   static int search(int[] nums,int target,boolean firstindex)
    {
        int ans =-1;
        int start =0;
        int end = nums.length-1;
        while(start<= end)
        {
            int mid = start+(end-start)/2;
            if(target<nums[mid])
            {
                end = mid-1;
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            }
            else
            {
               ans = mid;
               if(firstindex==true)
               {
                   end = mid-1;
               }
               else
               {
                   start = mid+1;
               }
            }
        }
        return ans;
    }

}

