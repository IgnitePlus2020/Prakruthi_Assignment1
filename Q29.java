// Binary search
package com.tgt.igniteplus;
import java.util.*;
public class Q29
{
    public static void main(String[] args)
    {
        int n,key;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of elements\n");
        n=in.nextInt();
        int[] a=new int[n];
        System.out.print("Enter the elements in sorted order\n");
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print("Enter the element to be searched");
        key=in.nextInt();
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(key==a[mid]){
                System.out.print("Element found at "+(mid+1)+" position");
                break;
            }
            else if(key<a[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        if(low>high)
            System.out.print("Element not found");
    }
}