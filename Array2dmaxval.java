package com.tridib;

import java.util.Arrays;

public class Array2dmaxval {
    public static void main(String[] args) {
        int[] arr={22,33,44,55,66,12};
        System.out.println(maxval(arr));

    }
    static int maxval(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]> max)
            {
                max=arr[i];
            }


        }
        return max;

    }
}
