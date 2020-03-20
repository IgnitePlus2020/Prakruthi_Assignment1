//reverse a given number
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q9
{
    static float reverseDig(float num)
    {
        float rev_num = 0;
        while(num > 0)
        {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    // Driver code
    public static void main (String[] args)
    {
        System.out.println("Enter the number\n");
        Scanner in=new Scanner(System.in);
        float num=in.nextFloat();
        System.out.println("Reverse of number is " + reverseDig(num));
    }
}
