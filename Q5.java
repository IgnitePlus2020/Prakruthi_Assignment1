// Checking even or odd
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q5
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number\n");
        Scanner in=new Scanner(System.in);
        double num=in.nextDouble();
        if(num%2==0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }


}
