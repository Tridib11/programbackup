package com.tridib;
import java.util.Arrays;
import java.util.Scanner;
public class Searchin2Dsortedarray {
    public static void main(String[] args) {
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
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target)
    {
        int r = binarysearchrow(arr,target);
        if(r == -1)
        {
            return new int[]{-1,-1};
        }
        int[] find=binarysearch(arr,r,target);
        return find;
    }
    static int[] binarysearch(int[][] arr,int r,int target)
    {
        int start=0;
        int end = arr[0].length-1;
        int mid = start+(end-start)/2;
        while(start<=end)
        {
            if(arr[r][mid]==target)
            {
                return new int[]{r,mid};
            }
            else if(arr[r][mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int binarysearchrow(int[][] matrix,int target)
    {
        int start =0;
        int end = matrix.length-1;
        int lc =matrix[0].length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target >= matrix[mid][0] && target<= matrix[mid][lc])
            {
                return mid;
            }
            else if(target > matrix[mid][0])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }
}
