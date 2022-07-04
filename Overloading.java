package com.tridib;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("trdib");
    }
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(String name)
    {
        System.out.println(name);
    }
}
