package com.tridib;
import java.util.Arrays;
import java.util.Scanner;

public class Array1Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num= new int[size];
        for (int i = 0; i < size; i++) {
            num[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(buildArray(num)));
        }
    static int[] buildArray(int[] num) {
        int n = num.length;
        int[] ans = new int[n];
        for(int i = 0 ; i< num.length;i++)
        {
        ans[i] = num[num[i]];
        }
        return ans;
    }
}

