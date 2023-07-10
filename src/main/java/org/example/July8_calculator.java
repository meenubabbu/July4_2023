package org.example;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;

public class July8_calculator {
    public static void main(String[] args) {
        System.out.println("This is the calculator program");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input");
        int input=scanner.nextInt();
        System.out.println("Enter the first number");
        Scanner scanner1=new Scanner(System.in);
        int num1=scanner1.nextInt();
        Scanner scanner2=new Scanner(System.in);
        int num2=scanner1.nextInt();

        switch(input)
        {
            case 1:
                System.out.println(num2+num1);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
        }
    }
}
