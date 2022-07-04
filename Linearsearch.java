package com.tridib;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("enter the element to be searched for");
        int target=sc.nextInt();
        System.out.println(linearsearch(arr,target));

    }static int linearsearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i = 0;i<arr.length;i++)
        {
            int element=arr[i];
            if(target == element)
            {
                return i;
            }
        }return -1;
    }
}
