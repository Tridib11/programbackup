package com.tridib;
import java.util.Arrays;
import java.util.Scanner;
public class Arraymaxwealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("enter the numbers");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        for (int[] j:arr) {
            System.out.println(Arrays.toString(j));
        }
        System.out.println("max wealth "+ maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0;i< accounts.length;i++)
        {
            int sum=0;
            for(int j = 0; j<accounts[i].length;j++)
            {
                sum+= accounts[i][j];
            }
            if (sum>max)
            {
                max= sum;
            }
        }return max;
    }
}
