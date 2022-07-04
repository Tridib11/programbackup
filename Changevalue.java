package com.tridib;

import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums)
    {
        nums[0] = 99; //if you make a change to the object via refernce variable the same object is going to be changed

    }
}
