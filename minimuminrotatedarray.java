package com.tridib;

public class minimuminrotatedarray {
    public static void main(String[] args) {
        int[] arr ={1};
        System.out.println(minimun(arr));
    }
    static int minimun(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        if(nums.length == 1)
        {
            return nums[nums.length-1];
        }
        if(nums[start]<nums[end])
        {
            return nums[start];
        }
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(mid < end && nums[mid] >= nums[mid+1])
            {
                return nums[mid+1];
            }
            else if(mid>start && nums[mid]<= nums[mid-1])
            {
                return nums[mid];
            }
            else if(nums[start] <= nums[mid])
            {
                start = mid+1;
            }
            else if(nums[mid]<=nums[end])
            {
                end=mid-1;
            }
        }
        return -1;
    }
}
