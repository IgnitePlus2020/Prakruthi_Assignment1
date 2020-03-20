//Largest and second largest of the lot
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q7
{
    public static void main(String[] args)
    {
        int a,b,c;
        System.out.print("Enter three numbers\n");
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b && a>c)
        {
            System.out.println("Largest= "+a);
            if(b<c)System.out.print("Second largest= "+c);
            else System.out.print("Second largest:"+b);
        }
        else if(b>a && b>c)
        {
            System.out.println("Largest= "+b);
            if(a<c)System.out.print("Second largest= "+c);
            else System.out.print("Second largest= "+a);
        }
        else
            {
            System.out.println("Largest:" + c);
            if (b < a) System.out.print("Second largest= " + a);
            else System.out.print("Second largest= " + b);
            }

    }
}
