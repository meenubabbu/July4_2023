package org.example;

import java.util.Scanner;

public class July8_charcalculator {
    public static void main(String[] args) {


        System.out.println("This is the calculator program");
        System.out.println("+ for addition");
        System.out.println("- for subtraction");
        System.out.println("* for multiplication");
        System.out.println("/ for division");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input");
        char input1 = scanner.next().charAt(0);
        System.out.println("Enter the first number");
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();
        System.out.println("Enter the second number");
        Scanner scanner2 = new Scanner(System.in);
        int num2 = scanner1.nextInt();
        System.out.println("The result is");

        switch (input1) {
            case '+':
                System.out.println(num2 + num1);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }
    }
}



