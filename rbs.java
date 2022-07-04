package com.tridib;

public class rbs {
    public static void main(String[] args) {
        int[] arr ={4,5,6,0,1,2,3};
        int target = 6;
        System.out.println(search(arr,target));

    }
     static int search(int[] nums, int target)
    {
        int pivot = find(nums);
        if(pivot == -1)
        {
            return bs(nums,target,0,nums.length-1);

        }
        if(nums[pivot] == target)
        {
            return pivot;
        }
        if(target >= nums[0])
        {
            return bs(nums,target,0,pivot-1);
        }
        else
        {
            return bs(nums,target,pivot+1,nums.length-1);
        }

    }
    static int bs(int[] arr,int target,int start,int end)
    {

        while(start <= end)
        {
            int mid = start + (end-start) /2;
            if(target > arr[mid])
            {
                start = mid+1;
            }
            else if(target < arr[mid])
            {
                end = mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    static int find(int[] arr)
    {
        int start =0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid] <= arr[start])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }

        }
        return -1;
    }
}
