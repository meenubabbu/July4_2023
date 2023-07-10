package org.example;

public class July8_loops {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=10;i++)
        {
            count=count+i;
            System.out.println("2 * "+i+" = "+(2*i));
        }
        System.out.println("sum of first ten natural numbers is "+count);
    }
}
