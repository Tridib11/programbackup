package com.tridib;

import java.util.Scanner;

public class maxwealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customer = sc.nextInt();
        int[][] arr = new int[customer][];
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println("Enter the total number of wealth");
            int wealth = sc.nextInt();
            arr[i]=new int[wealth];
            System.out.println("Enter the wealth from every bank account");
            for(int j =0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int ans = maxwealth(arr);
        System.out.println(ans);

    }
    static int maxwealth(int[][] account)
    {
        int maxwelth =Integer.MIN_VALUE;
        for(int persons =0;persons<account.length;persons++)
        {
            int sum = 0;
            for(int wealth =0;wealth<account[persons].length;wealth++)
            {
                sum+= account[persons][wealth];
            }
            if(sum>maxwelth)
            {
                maxwelth=sum;
            }
        }
        return maxwelth;
    }
}
