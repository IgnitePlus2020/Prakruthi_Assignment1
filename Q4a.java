//Swap two numbers
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q4a
{
    public static void main(String[] args){
        int i,j,temp;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter numbers to swap\n");
        i=in.nextInt();
        j=in.nextInt();
        temp=i;
        i=j;
        j=temp;
        System.out.println("After swapping "+i+"\t"+j);
    }
}

