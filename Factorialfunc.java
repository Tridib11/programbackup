package com.tridib;
import java.util.Scanner;
public class Factorialfunc {
    public static void main(String[] args) {
        int ans=0;
        long number=0;
        do
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();
        if (number == -1)
        {
            break;
        }
        ans = nthfactorial(number);
            System.out.println(ans);
        }while(true);
    }
    static int nthfactorial(long n)
    {
        int fact=1;
        int a = 0;
        int b = 1;
        if (n == 0)
        {
             fact=0;
        }
//        int temp;
//        int count = 1;
//        do
//        {
//            temp = b;
//            b = a+b;
//            a = temp;
//            count++;
//        }
//        while(count<=n);
        for (int i = 1; i <= n ; i++) {
            fact=fact*i;
        }
        return fact;
    }
}
