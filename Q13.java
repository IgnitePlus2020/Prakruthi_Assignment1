//Display numbers in sequence 1,4,27,256,3125.......n
package com.tgt.igniteplus;
import java.util.Scanner;
import static java.lang.Math.pow;
public class Q13
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter n\n");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=1;i<=n;i++)
            System.out.print((int)pow(i,i)+" ");
    }
}