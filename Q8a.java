//calculate the sum of odd numbers from 1- n.
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q8a
{
    public static void main(String[] args)
    {
        System.out.println("Enter n");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i,sum=0;
        for(i=0;i<=n;i++)
        {
            if(i%2!=0)
                sum=sum+i;
        }
       System.out.println("Sum= "+sum);
    }
}
