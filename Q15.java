//Display numbers in sequence 1,4,9,25,36,49.......n
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q15
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter n\n ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0)
                continue;
            System.out.print(i * i + "  ");
        }
    }
}