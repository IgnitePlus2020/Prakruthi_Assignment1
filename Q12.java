//Display numbers in sequence -1,2,-3,4,-5.......n
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q12
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter n\n");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
            else
                System.out.print(i*(-1)+" ");
        }
    }
}