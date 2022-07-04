package com.tridib;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpID = in.nextInt();
        String department = in.next();
        switch(EmpID)
        {
            case 1:
            {
                System.out.println("Tridib Ghosh");
                break;
            }
            case 2:
            {
                System.out.println("Rahul grover");
                break;
            }
            case 3:
            {
                if ("IT".equals(department)) {
                    System.out.println("IT Department");
                } else if ("Management".equals(department)) {
                    System.out.println("Management Department");
                } else {
                    System.out.println("Wrong departmnt entered");
                }
                break;
            }
            default:
                System.out.println("Enter correct ID");
        }
    }
}
