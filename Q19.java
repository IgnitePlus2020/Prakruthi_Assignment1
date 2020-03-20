//Convert decimal number to its binary equivalent.
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q19
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter number in decimal format\n ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] bin=new int[100];
        int i=0;
        while(n > 0){
            bin[i]=n%2;
            n=n/2;
            i++;
        }
        System.out.print(+n+" in binary is\n");
        for(int j=i-1;j>=0;j--)
            System.out.print(bin[j]);
    }
}