package com.tridib;
public class maximuminduplicaterotatedarray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 6, 1, 2, 3, 4};
        System.out.println(max(nums));
    }
    static int max(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] < arr[end])
        {
            return end;
        }
        if(arr.length == 1)
        {
            return arr[arr.length-1];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==arr[start] &&arr[mid]==arr[end])
            {
                if(arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;
                if(arr[mid]<arr[mid-1])
                {
                    return mid-1;
                }
                end--;
            }
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid-1]) {
                return mid - 1;
            } else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else if(arr[mid] <= arr[end])
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}



