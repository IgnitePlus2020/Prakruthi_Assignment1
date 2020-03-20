//Display numbers in sequence of 4,16,36...n
package com.tgt.igniteplus;
import java.util.Scanner;
import java.io.*;
public class Q11
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter n\n ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=2;i<=n;i+=2)
            System.out.print(i*i+"  ");
    }
}

