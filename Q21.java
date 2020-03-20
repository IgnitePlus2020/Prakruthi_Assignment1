//Display series 1,-2,6,-15,31,-56......n
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q21
{
    public static void main(String[] args)
    {
        int n,term=1;
        System.out.print("Enter n\n");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i=0;i<n;i++)
        {
            term =term+(i*i);
            if(i%2!=0)
                System.out.print("-");
            System.out.print(term+" ");

        }
    }
}