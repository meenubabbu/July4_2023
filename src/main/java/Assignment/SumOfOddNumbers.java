package Assignment;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        System.out.println("How many odd numbers you want?");
        Scanner sc1=new Scanner(System.in);
        int n= sc1.nextInt();

        System.out.println("Enter 1 for for loop,2 for while and 3 for do while");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        int num=1;
        switch(choice) {

            case 1:
                int sum=0;
                int oddnum1=1;
                for (int i = 1; i <= n; i++) {
                    sum=sum+oddnum1;
                    oddnum1=oddnum1+2;
                }
                System.out.println(sum);
                break;

            case 2:
                int sum1=0;
                int oddnum2=1;
                while(num<=n) {


                    sum1=sum1+oddnum2;
                    oddnum2=oddnum2+2;
                    num = num + 1;
                }
                System.out.println(sum1);
                break;

            case 3:
                int num3=0;
                int oddnum3=1;
                int sum2=0;
                do{
                    sum2=sum2+oddnum3;
                    oddnum3 = oddnum3 + 2;
                    num3++;


                }while(num3!=n);
                System.out.println(sum2);
                break;

            default:
                System.out.println("wrong choice");
                break;

        }
    }
}
