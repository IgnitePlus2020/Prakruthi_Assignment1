// Check if given string is palindrome
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q26
{
    public static void main(String[] args)
    {
        System.out.print("Enter string\n");
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
            rev=rev+s.charAt(i);
        if(s.equals(rev))
            System.out.print("String is palindrome\n");
        else
            System.out.print("Strinng is not palindrome\n");
    }
}