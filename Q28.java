// Linear search
package com.tgt.igniteplus;
import java.util.*;
public class Q28
{
    public static void main(String[] args)
    {
        int n,i,key;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements\n");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements\n");
        for (i = 0; i < n; i++)
            a[i] = in.nextInt();
        System.out.print("Enter the element to be searched");
        key = in.nextInt();
        for(i=0;i<n;i++){
            if(a[i]==key){
                System.out.print("The element is found at "+(i+1)+" position");
                break;
            }
        }
        if(i==n){
            System.out.print("Element not found");
        }
    }
}