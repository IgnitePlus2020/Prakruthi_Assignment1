//Verify if the number is an armstrong number or not
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q27
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number");
        int num,rem,res=0;
        num=in.nextInt();
        int temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            res=(int)(res+Math.pow(rem, 3));
            temp=temp/10;
        }
        if(res==num)
            System.out.println(num+" is an Armstrong number");
        else
            System.out.println(num+" is not an Armstrong number");
    }
}