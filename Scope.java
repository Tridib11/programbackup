package com.tridib;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
       //     int a=78;   // alrady initialised outside the block in the name method hence you cant initialise again.
            a=100; //reasigning the orignal vlaue to some other vale
            int c =99;
            //values initialised in this block cant use outside ht block
        }
        System.out.println(a);
        //System.out.println(c);
    }
}
