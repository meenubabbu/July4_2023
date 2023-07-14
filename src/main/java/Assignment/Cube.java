package Assignment;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {

        System.out.println("Enter integer ");
        Scanner sc1=new Scanner(System.in);
        float n=sc1.nextFloat();

        System.out.println("Enter 1 for for loop,2 for while and 3 for do while");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        switch(choice) {

            case 1:
                for (int i = 1; i <= n; i++) {
                    System.out.println("cube of "+i+" is "+(i*i*i));
                }
                break;

            case 2:
                int num=0;
                while(num<=n) {

                    num = num + 1;
                    System.out.println("cube of "+num+" is "+(num*num*num));
                }
                break;

            case 3:
                int num1=0;
                do{
                    num1 = num1 + 1;
                    System.out.println("cube of "+num1+" is "+(num1*num1*num1));

                }while(num1!=n);
                break;

            default:
                System.out.println("wrong choice");
                break;

        }
    }
}
