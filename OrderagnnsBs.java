package com.tridib;
public class OrderagnnsBs {
    public static void main(String[] args)
    {
        int[] arr={2,3,4,14,16,18};
        int target = 15;
        int ans = orderagnosticbinarysearch(arr,target);
        System.out.println(ans);
    }
    static int orderagnosticbinarysearch(int[] arr,int target)
    {
        int start=0;
        int end = arr.length-1;
        boolean isAsc;
        if(arr[start]<arr[end])
        {
            isAsc = true;
        }
        else
        {
            isAsc = false;
        }
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            if(isAsc)
            {
                if(target>arr[mid])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            else
            {
                if(target>arr[mid])
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
