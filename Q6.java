// Separate decimals
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q6
{
    public static void main(String[] args)
    {
        double n, temp = 0.0, w = 0.0, f = 0.0;
        int i = 1;
        System.out.println("Enter the number\n");
        Scanner in = new Scanner(System.in);
        n = in.nextDouble();
        do {
            i = i * 10;
            temp = n * i;
        } while ((temp % 10) != 0);
        i = i / 10;
        temp = (int) n;
        f = (n * i) - (temp * i);
        System.out.println("Number: " + n);
        System.out.println("Whole number: " + (int) n + "\nFraction: " + (int) f);
    }
}
