package com.tridib;

import java.util.Scanner;

public class Arraycharactersearch {
    public static void main(String[] args) {
       String name = "Tridib";
       char sc = 'i';
        System.out.println(search(name,sc));
    }static boolean search(String str,char target )
    {
        if(str.length()==0)
        {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i))
            {
                return true;
            }

        }
        return false;
    }
}
