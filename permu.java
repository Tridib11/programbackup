package com.tridib;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/build-array-from-permutation/
public class permu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= {0,2,1,5,3,4};

        System.out.println(Arrays.toString(buildArray(arr)));

    }
    static int[] buildArray(int[] num) {
        int[] arr = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            arr[i]=num[num[i]];
        }
        return arr;

    }
}
