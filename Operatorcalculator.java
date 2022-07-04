package com.tridib;

import java.util.Scanner;

public class Operatorcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fist number");
        float number1 = input.nextFloat();
        System.out.println("Enter second number");
        float number2 = input.nextFloat();
        System.out.println("Enter the operator you to do");
        char operator = input.next().charAt(0);


        float result;

        if (operator == '+')
        {
            result = number1 + number2;
            System.out.println("Add"+ " " + result);
        }
        else if (operator == '-')
        {
            result = number1 - number2;
            System.out.println("Subtract"+ " " + result);

        }
        else if (operator == '*')
        {
            result = number1 * number2;
            System.out.println("Multiply"+ " " + result);

        }
        else if (operator == '/')
        {
            result = number1 / number2;
            System.out.println("Division"+ " " + result);
        }
        else
        {
            System.out.println("wrong input");
        }

    }
}
