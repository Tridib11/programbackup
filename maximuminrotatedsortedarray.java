package com.tridib;
public class maximuminrotatedsortedarray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 0, 1, 3};
        System.out.println(max(arr));
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
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid-1]) {
                return mid - 1;
            } else if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else if(arr[mid] <= arr[end])
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}
