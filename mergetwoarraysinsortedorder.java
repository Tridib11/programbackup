package com.tridib;

import java.util.Arrays;

public class mergetwoarraysinsortedorder {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 6, 7, 13};
        int[] arr2 = {2, 4, 9, 11};
        System.out.println(Arrays.toString(merger(arr1, arr2)));

    }
    static int[] merger(int[] arr1, int[] arr2) {
        int i=0;
        int j =0;
        int len = arr1.length+arr2.length;
        int[] merger =new int[len];
        int k =0;
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                merger[k] = arr1[i];
                i++;
                k++;

            } else {
                merger[k] = arr2[j];
                j++;
                k++;
            }
        }
            while(i<arr1.length)
            {
                merger[k]=arr1[i];
                i++;
                k++;

            }
            while(j<arr2.length)
            {
                merger[k]=arr2[j];
                j++;
                k++;
            }
            return merger;

        }

    }

