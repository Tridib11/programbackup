package com.tridib;
import java.util.Arrays;
import java.util.Scanner;
public class Array2dMaxminreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {
            number[i]=sc.nextInt();
        }
        //swap(number,1,3);
        reverse(number);
        System.out.println(Arrays.toString(number));
        int m=max(number);
        System.out.println("maxximum value = "+ m);
    }
    static int max(int[] number)
    {
        int maxvalue=number[0];
        for (int i = 1; i < number.length; i++) {
            if(number[i]>maxvalue)
            {
                maxvalue=number[i];
            }
        }return maxvalue;
    }
    static void reverse(int[] number)
    {
        int start=0;
        int end = number.length-1;
        while(start<end)
        {
            int temp = number[start];
            number[start]=number[end];
            number[end]=temp;
            start++;
            end--;
        }

    }
    //reverse fromm a specified index to a spicified index
//    static void swap(int[] number,int index1,int index2)
//    {
//        int temp = number[index1];
//        number[index1]=number[index2];
//        number[index2]=temp;
//    }
}
