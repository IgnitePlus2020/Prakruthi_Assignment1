//Calculate x power n
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q24
{
    public static void main(String[] args)
    {
        int x,n,m,val=1;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter base value x\n");
        x=in.nextInt();
        System.out.print("Enter exponent value n\n");
        n=in.nextInt();
        m=n;
        if(x==0){
            System.out.print("0");
        }
        else {
            while (n != 0) {
                val = val * x;
                n--;
            }
            System.out.print("Value of " + x + " ^ " + m + " = " + val);
        }
    }
}