package com.tgt.igniteplus;
import java.util.Scanner;
public class Q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of pattern to be printed");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*"+" ");
            }

            System.out.println();
        }
        sc.close();
    }
}

/*
Enter the number of rows of pattern to be printed
5
*
* *
* * *
* * * *
* * * * *

Process finished with exit code 0

 */