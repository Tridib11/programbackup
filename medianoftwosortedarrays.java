package com.tridib;

import java.util.Arrays;

public class medianoftwosortedarrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j =0;
        int len = nums1.length+nums2.length;
        int[] merger =new int[len];
        int k =0;
        while (i<nums1.length && j<nums2.length) {
            if (nums1[i] < nums2[j]) {
                merger[k] = nums1[i];
                i++;
                k++;

            } else {
                merger[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length)
        {
            merger[k]=nums1[i];
            i++;
            k++;

        }
        while(j<nums2.length)
        {
            merger[k]=nums2[j];
            j++;
            k++;
        }
        double median =0.0;
        int mid = merger.length/2;
        if(merger.length %2==1)
        {
            median = merger[mid];
        }
        else
        {
            median = (merger[mid]+merger[mid-1])/2.0;
        }
        return median;
    }
}
