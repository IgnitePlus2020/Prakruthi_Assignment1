//Check for prime numbers in a given range
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args)
    {
        int n,m;
        System.out.print("Enter the range\n");
        Scanner in=new Scanner(System.in);
        Scanner in1=new Scanner(System.in);
        n=in.nextInt();
        m=in1.nextInt();
        while(n<m)
        {
            boolean flag=false;
            for(int i=2;i<=n/2;++i)
            {
                if(n%i==0){
                    flag=true;
                    break;
                }
            }
            if(!flag)
                System.out.print(n+" ");
            n++;
        }
    }
}