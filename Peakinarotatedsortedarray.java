package com.tridib;

public class Peakinarotatedsortedarray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,9,0,1};
        System.out.println(findPivot(arr));
    }
//    static int search(int[] nums,int target)
//    {
//        int pivot = findPivot(nums);
//        if(pivot==-1)
//        {
//            return bs(nums,target,0,nums.length-1)
//        }
//        if(nums[pivot]==target)
//        {
//            return pivot;
//        }
//    }
//    static int bs(int[] arr,int target,int start,int end)
//    {
//
//        while(start <= end)
//        {
//            int mid = start + (end-start) /2;
//            if(target < arr[mid])
//            {
//                end = mid-1;
//            }
//            else if(target > arr[mid])
//            {
//                start=mid+1;
//            }
//            else
//            {
//                return mid;
//            }
//        }
//        return -1;
//    }
    static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
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