package com.tridib;

import java.util.Scanner;

public class Fibo
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    int sumeven=0;
    int n = in.nextInt();
    int a = 0;
    int b = 1;
    int count = 2;
        if (n == 0)
        {
            System.out.println(0);
        }
else{
    // fisrt way
    while(count <=n)
    {
        int temp = b;
        b=b+a;
        a=temp;
        count++;
        if(b%2==0 && b<n)
        {
            sumeven=sumeven+b;
        }
    }
       System.out.println(b);

            //second way
//            while(count <=n)
//            {
//                int sum = b+a;
//                //System.out.println(sum);
//                a=b;
//                b=sum;
//                count++;
//            }
//            System.out.println(b);
   }
    }
}

