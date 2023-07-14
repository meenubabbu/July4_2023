package Assignment;

import java.util.Scanner;

public class First10 {

    public static void main(String[] args) {

        System.out.println("Enter 1 for for loop,2 for while and 3 for do while");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        int num=1;
        switch(choice) {

            case 1:
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
            break;

            case 2:

                while(num<=10) {
                    System.out.println(num);
                    num = num + 1;
                }
                break;

                case 3:
                    int num1=0;
                    do{
                        num1 = num1 + 1;
                        System.out.println(num1);

                    }while(num1!=10);
                break;
            default:
                System.out.println("wrong choice");
                break;

        }
    }
}
