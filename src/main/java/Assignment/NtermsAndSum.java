package Assignment;

import java.util.Scanner;

public class NtermsAndSum {
    public static void main(String[] args) {
        System.out.println("Enter number of terms");
        Scanner sc1=new Scanner(System.in);
        int n=sc1.nextInt();

        System.out.println("Enter 1 for for loop,2 for while and 3 for do while");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        int sum=0;
        int sum1=0;
        int sum2=0;
        switch(choice) {

            case 1:
                for (int i = 1; i <= n; i++) {
                    System.out.println(i);
                    sum=sum+i;

                }
                System.out.println("sum= "+sum);
                break;

            case 2:
                int num=1;
                while(num<=n) {
                    System.out.println(num);
                    sum1=sum1+num;
                    num = num + 1;
                }
                System.out.println("sum= "+sum1);
                break;

            case 3:
                int num1=0;
                do{
                    num1 = num1 + 1;
                    System.out.println(num1);
                  sum2+=num1;
                }while(num1!=n);
                System.out.println("sum= "+sum2);
                break;
            default:
                System.out.println("wrong choice");
                break;

        }
    }
}
