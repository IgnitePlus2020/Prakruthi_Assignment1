package com.tgt.igniteplus;
import java.util.Scanner;
public class Q2
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter the number of rows to be printed\n ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for (int i=0; i<n; i++){
            for (int j=n-i; j>1; j--){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


/*
Enter the number of rows to be printed
 5
    *
   * *
  * * *
 * * * *
* * * * *

Process finished with exit code 0
 */