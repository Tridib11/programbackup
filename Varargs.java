package com.tridib;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        demo(3,2,3,4,4,5,5);
        dem("test","try");
        multiple(1,2,"kjhdfkjsdhfkjsdfkjsdgfsdjgf");

    }
    static void demo(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static void dem(String ...v) // f nothing is passed in this (...v) this things it will be error it is knon as ambiguiti
    {
        System.out.println(Arrays.toString(v));

    }
    static void multiple(int a,int b,String ...v)
    {
        //System.out.println(multiple());

    }

}
