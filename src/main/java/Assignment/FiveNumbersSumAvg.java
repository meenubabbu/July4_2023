package Assignment;

import java.util.Scanner;

public class FiveNumbersSumAvg {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc1=new Scanner(System.in);
        int a=sc1.nextInt();

        System.out.println("Enter second number");
        Scanner sc2=new Scanner(System.in);
        int b=sc1.nextInt();

        System.out.println("Enter third number");
        Scanner sc3=new Scanner(System.in);
        int c=sc1.nextInt();

        System.out.println("Enter fourth number");
        Scanner sc4=new Scanner(System.in);
        int d=sc1.nextInt();

        System.out.println("Enter fifth number");
        Scanner sc5=new Scanner(System.in);
        int e=sc1.nextInt();

        System.out.println("Enter 1 for for loop,2 for while and 3 for do while");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        int sum=0;
        int avg=0;
        switch(choice) {

            case 1:
                int A[]={a,b,c,d,e};
                for (int i = 0; i <= 4; i++) {

                    sum=sum+A[i];

                }
                System.out.println("sum= "+sum);
                System.out.println("Average= "+(sum/5));
                break;

            case 2:
                int num=1;
                int sum1=0;
                while(num<=5) {

                    sum1=sum1+num;
                    num = num + 1;
                }
                System.out.println("sum= "+sum1);
                System.out.println("average="+sum1/5);
                break;

            case 3:
                int num1=0;
                int sum2=0;
                do{
                    num1 = num1 + 1;
                    System.out.println(num1);
                    sum2+=num1;
                }while(num1!=5);
                System.out.println("sum= "+sum2);
                System.out.println("average= "+sum2/5);
                break;
            default:
                System.out.println("wrong choice");
                break;

        }
    }
}
