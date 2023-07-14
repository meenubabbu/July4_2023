package July11_2023;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first_number = sc.nextInt(); //taking first number from user
        System.out.print("Enter second number: ");
        int second_number = sc.nextInt();
        System.out.println("Enter third number");
        int third_number = sc.nextInt();
        if (first_number>second_number && first_number>third_number)
        {
            System.out.println(first_number + " is greater than " + second_number + " and  " + third_number);
        } else if (second_number>third_number)
        {
            System.out.println(second_number + " is greater than " + first_number + " and "  + third_number);


        }
        else
        {
            System.out.println(third_number + " is greater than " + first_number + " and  " + second_number);
        }
    }

    }

