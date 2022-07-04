package com.tridib;
import java.util.Scanner;
public class fibnacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int firstnumber = 0;
        System.out.print(firstnumber+",");
        int secondnumber = 1;
        System.out.print(secondnumber+",");
        //just for the sake of clarity maine dono se hi kr diya
        //using for loop
//        for(int i = 3; i<= n+1;i++)
//        {
//            int thirdnumber = firstnumber + secondnumber;
//            System.out.print(thirdnumber+",");
//            firstnumber=secondnumber;
//            secondnumber=thirdnumber;
//        }
        // using while loop
        int i = 2;
        while(i <= n)
        {
            int thirdnumber = firstnumber + secondnumber;
            System.out.print(thirdnumber + ",");
            firstnumber = secondnumber;
            secondnumber = thirdnumber;
            i++;
        }
    }
}

