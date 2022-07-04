package com.tridib;
import java.util.Arrays;
import java.util.Scanner;
public class Searchin2darrayinput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
        int[][] arr = new int[row][];
        for(int i =0 ; i< arr.length;i++)
        {
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            arr[i] = new int[size];
            for(int j =0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your Array looks like");
        for (int[] num : arr) {
            System.out.println(Arrays.toString(num));
        }
        System.out.println("Enter the value to be searched for");
        int target = sc.nextInt();
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target)
    {
        for(int i = 0 ;i< arr.length;i++)
        {
            for(int j = 0; j< arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    System.out.println("Element found at position");
                    return new int[]{i,j};
                }
            }
        }
        System.out.println("Element not found so providing a predefined position");
        return new int[]{-1,-1};
    }

}