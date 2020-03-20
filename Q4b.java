// swapping three numbers
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q4b
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter three numbers to be swapped\n");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.println("After Swapping\n1"+a+"\t"+b+"\t"+c);
    }
}
