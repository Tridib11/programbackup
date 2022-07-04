package com.tridib;

import java.util.Scanner;
//12,345,2,6,7896

public class ArrayEvennoofdigitinarraychecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int evennoofdigit = evennoofdigits(arr);
        System.out.println(evennoofdigit);
    }
    static int evennoofdigits(int[] nums)
    {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            int num = nums[i];


            if(even(num)==true)
            {
                count++;
            }
        }return count;
    }
    static boolean even(int nums)
    {
        int numberofdigitcheckerforeven = digitcheck(nums);
        if(numberofdigitcheckerforeven % 2 == 0 )

        {
            return true;

        }else
        {
            return false;
        }

    }
    static int digitcheck(int nums1)
    {
        if(nums1<0)
        {
            nums1= nums1*-1;
        }
        if(nums1==0)
        {
            return 0;
        }
        int count = 0;
        while(nums1>0)
        {
            count++;
            nums1= nums1/10;
        }return count;
    }
}
