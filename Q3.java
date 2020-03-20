//Simple Interest
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q3
{
    public static void main(String[] args)
    {
        System.out.println("Enter the necessary to calculate Simple Interest:\n");
        System.out.println("Enter principle amount:\n");
        Scanner in=new Scanner(System.in);
        double p=in.nextDouble();
        System.out.println("Enter the rate of interest:\n");
        Scanner in1=new Scanner(System.in);
        double r=in1.nextDouble();
        System.out.println("Enter the time in years");
        Scanner in2=new Scanner(System.in);
        double t=in2.nextDouble();
        double si=(p*r*t)/100.0;
        System.out.println("Formula: Principle * Rate of Interest * Time(in years)/100\n");
        System.out.println("The calculated Simple Interest is: "+si);
    }
}
