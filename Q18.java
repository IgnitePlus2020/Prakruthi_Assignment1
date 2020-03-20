//a program to calculate a factorial of a given number
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q18
{
    public static void main(String[] args)
    {
        int n,fact=1;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number\n");
        n=in.nextInt();
        for(int i=n;i>0;i--)
            fact=fact*i;
        System.out.print("The factorial of "+n+" is "+fact);
    }
}