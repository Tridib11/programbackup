package com.tridib;
//https://leetcode.com/problems/palindrome-number/
public class pn {
    public static void main(String[] args) {
        int n =123;
        System.out.println(isPalindrome(n));
    }
    static boolean isPalindrome(int x) {
        int temp = x;
        int sum=0;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            int d = x%10;
            sum = sum*10+d;
            x=x/10;
        }
        if(temp == sum)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
