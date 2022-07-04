package com.tridib;
import java.util.Scanner;
public class Searchininfinitesortedarray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter the elements in the array");
//        for (int i = 0; i < size; i++) {
//            arr[i]=sc.nextInt();
//        }
//        int target;
//        System.out.println("Enter the target");
//        target = sc.nextInt();
//        System.out.println(answer(arr,target));
        int[] arr ={3,5,7,91,10,90,100,130};
        int target = 10;
        System.out.println(answer(arr,target));
    }
    static int answer(int[] ans, int target)
    {
        int start=0;
        int end =1;
        while(target>ans[end])
        {
            int newstart= end+1;
            end = end+(end-start+1)*2;
            start = newstart;
        }
        return binarySearch(ans,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
