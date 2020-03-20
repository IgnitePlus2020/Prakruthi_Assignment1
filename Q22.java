//Fibonacci series
package com.tgt.igniteplus;
import java.util.*;
public class Q22
{
    public static void main(String[] args)
    {
        int[] a=new int[30];
        a[0]=1;
        a[1]=1;
        int n;
        System.out.print("Enter the number of terms\n");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.print(a[0]+" "+a[1]+" ");
        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
            System.out.print(a[i]+" ");
        }
    }
}