package Assignment;

import java.util.Scanner;

public class Largest_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first_number = sc.nextInt(); //taking first number from user
        System.out.println("Enter second number: ");
        int second_number = sc.nextInt();
        System.out.println("Enter third number");
        int third_number = sc.nextInt();
        // int currant=first_number;

        int[] A={first_number,second_number,third_number};
        int currant=A[0];

       for(int i=0;i<=1;i++)

        {

            if(A[i+1]>currant)
                currant=A[i+1];

        }

        System.out.println(currant+" is the greatest");
    }
}
