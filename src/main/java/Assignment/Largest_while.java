package Assignment;

import java.util.Scanner;

public class Largest_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first_number = sc.nextInt(); //taking first number from user
        System.out.println("Enter second number: ");
        int second_number = sc.nextInt();
        System.out.println("Enter third number: ");
        int third_number = sc.nextInt();

        while(first_number>second_number && first_number>third_number)
        {
                System.out.println(first_number+" is the greatest");
                break;
        }

        while(first_number<second_number && second_number>third_number)
        {
            System.out.println(second_number+"is the greatest");
            break;

        }

        while(third_number>first_number && second_number<third_number)
        {
            System.out.println(third_number+"is the greatest");
            break;
        }

    }
}
