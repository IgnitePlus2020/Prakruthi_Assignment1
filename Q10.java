//display numbers in words
package com.tgt.igniteplus;
import java.util.Scanner;
public class Q10
{
    public  static  void main(String[] args)
    {
        int num=0;
        System.out.println("Enter the number\n");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        char[] numberStr= String.valueOf(num).toCharArray();
        for (char c:numberStr){
            switch(c){
                case '0':System.out.print("zero ");
                    break;
                case '1':System.out.print("one ");
                    break;
                case '2':System.out.print("two ");
                    break;
                case '3':System.out.print("three ");
                    break;
                case '4':System.out.print("four ");
                    break;
                case '5':System.out.print("five ");
                    break;
                case '6':System.out.print("six ");
                    break;
                case '7':System.out.print("seven ");
                    break;
                case '8':System.out.print("eight ");
                    break;
                case '9':System.out.print("nine ");
                    break;
            }

        }

    }
}

